package edu.grinnell.sortingvisualizer.events;

import java.util.LinkedList;
import java.util.List;

public class CompareEvent<T> implements SortEvent<T> {

	private int fstIndex;
	private int sndIndex;
	List<Integer> indices;
	
	public CompareEvent(int index1, int index2) {
		fstIndex = index1;
		sndIndex = index2;
		indices = new LinkedList<>();
	}
	
	public void apply(LinkedList<SortEvent<T>> arr) {
		arr.add(new CompareEvent<>(fstIndex, sndIndex));
		
		if (!indices.contains(fstIndex)) { indices.add(fstIndex); }
		if (!indices.contains(sndIndex)) { indices.add(sndIndex); }
	}

	public List<Integer> getAffectedIndices() {
		return indices;
	}

	public boolean isEmphasized() {
		return false;
	}

}
