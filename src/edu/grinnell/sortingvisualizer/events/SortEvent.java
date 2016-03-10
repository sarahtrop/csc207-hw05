package edu.grinnell.sortingvisualizer.events;

import java.util.LinkedList;
import java.util.List;

public interface SortEvent<T> {
	public void apply(LinkedList<SortEvent<T>> arr);
	public List<Integer> getAffectedIndices();
	public boolean isEmphasized();

}
