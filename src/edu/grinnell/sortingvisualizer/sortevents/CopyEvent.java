package edu.grinnell.sortingvisualizer.sortevents;

import java.util.List;

public class CopyEvent<T> implements SortEvent<T> {

	// What to copy
	private int startIndex;
	private int endIndex;
	private List<Integer> indices;
	
	public CopyEvent(int index1, int index2) {
		startIndex = index1;
		endIndex = index2;
		
		for (int i = index1; i <= index2; i++) {
			indices.add(i);
		}
	}
	
	@SuppressWarnings("hiding")
	public <T extends Comparable<T>> void apply(T[] arr) {
		
	}

	public List<Integer> getAffectedIndices() {
		return indices;
	}

	public boolean isEmphasized() {
		return true;
	}

}
