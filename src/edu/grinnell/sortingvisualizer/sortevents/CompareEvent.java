package edu.grinnell.sortingvisualizer.sortevents;

import java.util.ArrayList;
import java.util.List;

public class CompareEvent<T> implements SortEvent<T> {

	private int fstIndex;
	private int sndIndex;
	
	public CompareEvent(int index1, int index2) {
		fstIndex = index1;
		sndIndex = index2;
	}
	
	@SuppressWarnings("hiding")
	public <T extends Comparable<T>> void apply(T[] arr) {
		arr[fstIndex].compareTo(arr[sndIndex]);
	}

	public List<Integer> getAffectedIndices() {
		List<Integer> indices = new ArrayList<Integer>();
		indices.add(fstIndex);
		indices.add(sndIndex);
		return indices;
	}

	public boolean isEmphasized() {
		return false;
	}

}
