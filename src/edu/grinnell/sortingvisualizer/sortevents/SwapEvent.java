package edu.grinnell.sortingvisualizer.sortevents;

import java.util.ArrayList;
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
	
	public <T extends Comparable<T>> void apply(ArrayList<T> arr) {
		T temp = arr.get(fstIndex);
		arr.add(fstIndex, arr.get(sndIndex));
		arr.remove(fstIndex + 1);
		arr.add(sndIndex, temp);
		arr.remove(sndIndex + 1);
	}

	public List<Integer> getAffectedIndices() {
		return indices;
	}

	public boolean isEmphasized() {
		return true;
	}
		
}
