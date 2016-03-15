package edu.grinnell.sortingvisualizer.sortevents;

import java.util.List;

public class CopyEvent<T> implements SortEvent<T> {

	private int fstIndex; //copied
	private int sndIndex; // copied into
	private List<Integer> indices;
	
	public CopyEvent(int index1, int index2) {
		fstIndex = index1;
		sndIndex = index2;
		indices.add(index1);
		indices.add(index2);
	}
	
	@SuppressWarnings("hiding")
	public <T extends Comparable<T>> void apply(T[] arr) {
		arr[sndIndex] = arr[fstIndex];
	}

	public List<Integer> getAffectedIndices() {
		return indices;
	}

	public boolean isEmphasized() {
		return true;
	}

}
