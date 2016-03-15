package edu.grinnell.sortingvisualizer.sortevents;
import java.util.List;

public interface SortEvent<T> {
	@SuppressWarnings("hiding")
	public <T extends Comparable<T>> void apply(T[] arr);
	public List<Integer> getAffectedIndices();
	public boolean isEmphasized();

}
