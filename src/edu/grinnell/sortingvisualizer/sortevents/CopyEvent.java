package edu.grinnell.sortingvisualizer.sortevents;

import java.util.ArrayList;
import java.util.List;

public class CopyEvent<T> implements SortEvent<T> {

	private int fstIndex; //copied
	private int sndIndex; // copied into
	
	public CopyEvent(int index1, int index2) {
		fstIndex = index1;
		sndIndex = index2;
	}
	
	public void apply(T[] arr) {
		if (sndIndex >= arr.length)
			return;
		arr[sndIndex] = arr[fstIndex];
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
