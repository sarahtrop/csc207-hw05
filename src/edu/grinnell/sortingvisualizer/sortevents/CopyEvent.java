package edu.grinnell.sortingvisualizer.sortevents;

import java.util.ArrayList;
import java.util.List;

public class CopyEvent<T> implements SortEvent<T> {

	// What to copy
	private int startOriginal;
	private int endOriginal;
	// Where to copy it to
	private int startCopied;
	private int endCopied;
	private List<Integer> indices;
	
	public CopyEvent(int index1, int index2, int index3, int index4) {
		startOriginal = index1;
		endOriginal = index2;
		startCopied = index3;
		endCopied = index4;
		
		for (int i = index1; i <= index2; i++) {
			indices.add(i);
		}
	}
	
	public <T extends Comparable<T>> void apply(ArrayList<T> arr) {
		
	}

	public List<Integer> getAffectedIndices() {
		return indices;
	}

	public boolean isEmphasized() {
		return true;
	}

}
