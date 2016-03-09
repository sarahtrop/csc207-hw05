package edu.grinnell.sortingvisualizer.events;

import java.util.List;

public class SwapEvent<T> implements SortEvent<T> {
	
	int fstIndex;
	int sndIndex;
	
	public SwapEvent(int index1, int index2) {
		fstIndex = index1;
		sndIndex = index2;
	}
	void apply(T arr) {
		// TODO Auto-generated method stub
		
	}

	public List<Integer> getAffectedIndices() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isEmphasized() {
		return true;
	}
}
