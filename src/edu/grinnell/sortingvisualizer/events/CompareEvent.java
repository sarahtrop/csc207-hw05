package edu.grinnell.sortingvisualizer.events;

import java.util.List;

public class CompareEvent<T> implements SortEvent<T> {

	private int fstIndex;
	private int sndIndex;
	List<Integer> indices;
	
	public CompareEvent(int index1, int index2) {
		fstIndex = index1;
		sndIndex = index2;
		// somehow have to mark that these go together, and are a compare event
		indices.add(index1);
		indices.add(index2);
	}
	
	public void apply(T[] arr) {
		for (int i = 0; i < arr.length; i++) {
			// figure out what type of event it was
			// apply events from indices to array
		}
	}

	public List<Integer> getAffectedIndices() {
		return indices;
	}

	public boolean isEmphasized() {
		return false;
	}

}
