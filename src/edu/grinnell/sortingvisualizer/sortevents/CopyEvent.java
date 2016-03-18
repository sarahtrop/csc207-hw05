package edu.grinnell.sortingvisualizer.sortevents;

import java.util.ArrayList;
import java.util.List;

public class CopyEvent<T> implements SortEvent<T> {

	private int fstIndex;
	private int sndIndex;
	private T[] copy;
	
	public CopyEvent(T[] newArr, int index1, int index2) {
		fstIndex = index1;
		sndIndex = index2;
		copy = newArr;
	}
	
	public void apply(T[] arr) {
		copy[fstIndex] = arr[sndIndex];
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
