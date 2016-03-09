package edu.grinnell.sortingvisualizer.events;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CompareEvent<T> implements SortEvent<T> {

	int fstIndex;
	int sndIndex;
	
	public CompareEvent(int index1, int index2) {
		fstIndex = index1;
		sndIndex = index2;
	}
	
	public void apply(ArrayList<SortEvent> arr) {
		
	}

	public List<Integer> getAffectedIndices() {
		return ;
	}

	public boolean isEmphasized() {
		return false;
	}

}
