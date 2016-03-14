package edu.grinnell.sortingvisualizer.sortevents;

import java.util.ArrayList;
import java.util.List;

public class CompareEvent<T> implements SortEvent<T> {

	private int fstIndex;
	private int sndIndex;
	private List<Integer> indices;
	
	public int compared;
	
	public CompareEvent(int index1, int index2) {
		fstIndex = index1;
		sndIndex = index2;
		indices.add(index1);
		indices.add(index2);
	}
	
	public <T extends Comparable<T>> void apply(ArrayList<T> arr) {
		compared = arr.get(fstIndex).compareTo(arr.get(sndIndex));
	}

	public List<Integer> getAffectedIndices() {
		return indices;
	}

	public boolean isEmphasized() {
		return false;
	}

}
