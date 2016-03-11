package edu.grinnell.sortingvisualizer.events;

import java.util.List;

public class CopyEvent<T> implements SortEvent<T> {

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
	
	public <T extends Comparable<T>> void apply(T[] arr) {
		// implement copying procedure
	}

	public List<Integer> getAffectedIndices() {
		return indices;
	}

	public boolean isEmphasized() {
		return true;
	}

}
