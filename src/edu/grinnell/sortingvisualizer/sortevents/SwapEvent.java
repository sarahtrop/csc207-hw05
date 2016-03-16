package edu.grinnell.sortingvisualizer.sortevents;

import java.util.ArrayList;
import java.util.List;

public class SwapEvent<T> implements SortEvent<T> {

	private int fstIndex;
	private int sndIndex;
	
	public SwapEvent(int index1, int index2) {
		fstIndex = index1;
		sndIndex = index2;
	}
	
	@SuppressWarnings("hiding")
	public <T extends Comparable<T>> void apply(T[] arr) {
		T temp = arr[fstIndex];
		arr[fstIndex] = arr[sndIndex];
		arr[sndIndex] = temp;
	}

	public List<Integer> getAffectedIndices() {
		List<Integer> indices = new ArrayList<Integer>();
		indices.add(fstIndex);
		indices.add(sndIndex);
		return indices;
	}

	public boolean isEmphasized() {
		return true;
	}
		
}
