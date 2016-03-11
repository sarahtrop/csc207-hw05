package edu.grinnell.sortingvisualizer.events;

import java.util.List;

public class SwapEvent<T> implements SortEvent<T> {

	private int fstIndex;
	private int sndIndex;
	private List<Integer> indices;
	
	public SwapEvent(int index1, int index2) {
		fstIndex = index1;
		sndIndex = index2;
		indices.add(index1);
		indices.add(index2);
	}
	
	public <T extends Comparable<T>> void apply(T[] arr) {
		T temp = arr[fstIndex];
		arr[fstIndex] = arr[sndIndex];
		arr[sndIndex] = temp;
	}

	public List<Integer> getAffectedIndices() {
		return indices;
	}

	public boolean isEmphasized() {
		return true;
	}
	
	
}
