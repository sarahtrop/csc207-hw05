package edu.grinnell.sortingvisualizer.sorts;

import java.util.ArrayList;
import java.util.List;

import edu.grinnell.sortingvisualizer.sortevents.CompareEvent;
import edu.grinnell.sortingvisualizer.sortevents.CopyEvent;
import edu.grinnell.sortingvisualizer.sortevents.SortEvent;
import edu.grinnell.sortingvisualizer.sortevents.SwapEvent;

public class Sorts {
	
	/**
	 * Method sorts an array in ascending order using the selection sort algorithm.
	 * @param arr	an array
	 * @author tropsara17, ehrhardh17
	 */
	public static <T extends Comparable<T>> List<SortEvent<T>> selectionSort(T[] arr) {
		List<SortEvent<T>> events = new ArrayList<>(); 
		for(int i = 0; i < arr.length; i++) {
			int temp = i;
			for (int j = i; j < arr.length; j++) {
				if (arr[j].compareTo(arr[temp]) < 0) {
					events.add(new CompareEvent<>(i, j));
					temp = j;
				}
			}
			swap(arr, temp, i);
			events.add(new SwapEvent<>(temp, i));
		}	
		return events;
	}
	
	/**
	 * Method sorts an array in ascending using the insertion sort algorithm.
	 * @param arr	an array
	 * @author tropsara17, ehrhardh17
	 */
	public static <T extends Comparable<T>> List<SortEvent<T>> insertionSort(T[] arr) {
		List<SortEvent<T>> events = new ArrayList<>(); 
		for(int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j].compareTo(arr[j-1]) < 0) {
					events.add(new CompareEvent<>(i, j));
					swap(arr, j, i);
					events.add(new SwapEvent<>(j, i));
				}
			}
		}
		return events;
	}
	
	/**
	 * Method sorts an array in ascending order using the bubble sort algorithm.
	 * @param arr	an array
	 * @author tropsara17, ehrhardh17
	 */
	public static <T extends Comparable<T>> List<SortEvent<T>> bubbleSort(T[] arr) {
		List<SortEvent<T>> events = new ArrayList<>();
		for(int i = arr.length - 1; i >= 0; i--) {
			int temp = i;
			for (int j = i; j >= 0; j--) {
				if (arr[j].compareTo(arr[temp]) > 0) {
					events.add(new CompareEvent<>(i, j));
					temp = j;
				}
			}
			swap(arr, temp, i);
			events.add(new SwapEvent<>(temp, i));
		}
		return events;
	}
	
	/**
	 * Method sorts an array in ascending order using the merge sort algorithm.
	 * @param arr	an array
	 * @author tropsara17, ehrhardh17
	 */
	public static <T extends Comparable<T>> List<SortEvent<T>> mergeSort(T[] arr) {
		return mergeSortHelper(arr, 0, arr.length);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends Comparable<T>> List<SortEvent<T>> mergeSortHelper(T[] arr, int lo, int hi) {
		List<SortEvent<T>> events = new ArrayList<>();
		int mid = (hi - lo) / 2 + lo;
		
		if (hi - lo > 1) {
			mergeSortHelper(arr, lo, mid);
			mergeSortHelper(arr, mid, hi);
		}
		
		int lowerBound = lo;
		int middle = mid;
		Object[] newArray = new Object[hi-lo];
		for(int n = 0; n < hi-lo; n++) {
			if(middle == hi || (arr[lowerBound].compareTo(arr[middle]) < 0 && lowerBound < mid)) {
				events.add(new CompareEvent<>(lowerBound, middle));
				newArray[n] = arr[lowerBound];
				lowerBound++;
			} else {
				newArray[n] = arr[middle];
				events.add(new CopyEvent<>(middle, n));
				middle++;
			}
		}
		for (int m = lo; m < hi; m++) {
			arr[m] = (T)newArray[m-lo];
		}
		return events;
	}
	
	/**
	 * Method sorts an array in ascending order using the quick sort algorithm.
	 * @param arr	an array
	 * @author tropsara17, ehrhardh17
	 */
	public static <T extends Comparable<T>> List<SortEvent<T>> quickSort(T[] arr) {
		return quickSortHelper(arr, 0, arr.length - 1);
	}
	
    public static <T extends Comparable<T>> List<SortEvent<T>> quickSortHelper(T[] arr, int lo, int hi) {
    	List<SortEvent<T>> events = new ArrayList<>();
    	int i = lo;
        int j = hi;
        int index = lo+(hi-lo)/2;
        T pivot = arr[index];
        
        while (i <= j) {
            while (arr[i].compareTo(pivot) < 0) {
            	events.add(new CompareEvent<>(i, index));
                i++;
            }
            while (arr[j].compareTo(pivot) > 0) {
            	events.add(new CompareEvent<>(j, index));
                j--;
            }
            if (i <= j) {
                swap(arr, i, j);
                events.add(new SwapEvent<>(i, j));
                i++;
                j--;
            }
        }
        if (hi < j)
            quickSortHelper(arr, lo, j);
        if (i < hi)
            quickSortHelper(arr, i, lo);
        return events;
    }

	/**
	 * Method sorts an array in ascending order using the shell sort algorithm.
	 * @param arr	an array
	 * @author tropsara17, hudsonad17
	 */
	public static <T extends Comparable<T>> List<SortEvent<T>> shellSort(T[] arr) {
		List<SortEvent<T>> events = new ArrayList<>();
		int[] gaps = new int[arr.length / 2 + 1];
		int currGap = arr.length;
		
		for(int i = gaps.length - 1; i >= 0; i--) {
			gaps[i] =  currGap;
			currGap = currGap / 2;
		}
		
		int i, j;
		for (int g : gaps) {
			for(i = g; i < arr.length; i++) {
				T temp = arr[i];
				for(j = i; j >= g && arr[j-g].compareTo(temp) > 0; j -= g) {
					events.add(new CompareEvent<>(i, j));
					arr[j] = arr[j-g];
				}
				arr[j] = temp;
				events.add(new CopyEvent<>(i, j));
			}
		}
		return events;
	}

	/**
	 * Method sorts 	an array.
	 * @param arr		an array
	 * @param events	a linked list
	 * @author tropsara17, hudsonad17
	 */
	public static <T extends Comparable<T>>void eventSort(T[] arr, List<SortEvent<T>> events) {
		for(int i = 0; i < arr.length; i++) {
			events.get(i).apply(arr);
		}
	}
	
	/**
	 * Swaps two values in an array
	 * @param arr	an array
	 * @param j		an integer
	 * @param i		an integer
	 * @author tropsara17, ehrhardh17
	 */
	public static <T extends Comparable<T>> void swap (T[] arr, int j, int i) {
		T temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}
}
