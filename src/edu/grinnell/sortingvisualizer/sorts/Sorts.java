package edu.grinnell.sortingvisualizer.sorts;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import edu.grinnell.sortingvisualizer.events.CompareEvent;
import edu.grinnell.sortingvisualizer.events.SortEvent;
import edu.grinnell.sortingvisualizer.events.SwapEvent;

public class Sorts {
	
	/**
	 * Method sorts an array in ascending order using the selection sort algorithm.
	 * @param arr	an array
	 * @author tropsara17, ehrhardh17
	 *
	public static <T extends Comparable<T>> List<Integer> selectionSort(T[] arr) {
		LinkedList<SortEvent<T>> events = new LinkedList<>();
		for(int i = 0; i < arr.length; i++) {
			int temp = i;
			for (int j = i; j < arr.length; j++) {
				if (arr[j].compareTo(arr[temp]) < 0) {
					CompareEvent compared = new CompareEvent(i, j);
					events.apply(compared);
					temp = j;
					SwapEvent swapped = new SwapEvent(i, j);
					events.apply(swapped);
				}
			}
			swap(arr, temp, i);
		}	
		return events.getAffectedIndices();
	}
	*/
	
	/**
	 * Method sorts an array in ascending using the insertion sort algorithm.
	 * @param arr	an array
	 * @author tropsara17, ehrhardh17
	 */
	public static <T extends Comparable<T>> void insertionSort(T[] arr) {
		for(int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j].compareTo(arr[j-1]) < 0) {
					swap(arr, j, i);
				}
			}
		}
	}
	
	/**
	 * Method sorts an array in ascending order using the bubble sort algorithm.
	 * @param arr	an array
	 * @author tropsara17, ehrhardh17
	 */
	public static <T extends Comparable<T>> void bubbleSort(T[] arr) {
		for(int i = arr.length - 1; i >= 0; i--) {
			int temp = i;
			for (int j = i; j >= 0; j--) {
				if (arr[j].compareTo(arr[temp]) > 0) {
					temp = j;
				}
			}
			swap(arr, temp, i);
		}
	}
	
	/**
	 * Method sorts an array in ascending order using the merge sort algorithm.
	 * @param arr	an array
	 * @author tropsara17, ehrhardh17
	 */
	public static <T extends Comparable<T>> void mergeSort(T[] arr) {
		arr = Arrays.copyOf(mergeSortHelper(arr, 0, arr.length), arr.length);
	}
	
	public static <T extends Comparable<T>> T[] mergeSortHelper(T[] arr, int lo, int hi) {
		int mid = arr.length / 2;
		int leftSize = mid;
		int rightSize = arr.length - mid;
		T[] result = new T[arr.length];
		
		T[] left = mergeSortHelper(arr, lo, mid);
		T[] right = mergeSortHelper(arr, mid, hi);
		
		int leftPos = 0;
		int rightPos = 0;
		int resultPos = 0;
		
		while(leftPos < leftSize || rightPos < rightSize) {
			if (leftPos == leftSize) {
				result[resultPos] = right[rightPos];
				rightPos++;
				resultPos++;
			} else if (rightPos == rightSize) {
				result[resultPos] = left[leftPos];
				leftPos++;
				resultPos++;
			} else {
				if (left[leftPos].compareTo(right[rightPos]) < 0) {
					result[resultPos] = left[leftPos];
					resultPos++;
					leftPos++;
				} else {
					result[resultPos] = right[rightPos];
					resultPos++;
					rightPos++;
				}
			}
		}
		return result;
	}
	
	/**
	 * Method sorts an array in ascending order using the quick sort algorithm.
	 * @param arr	an array
	 * @author tropsara17, ehrhardh17
	 */
	public static <T extends Comparable<T>> void quickSort(T[] arr) {
		
	}

	/**
	 * Method sorts an array in ascending order using the shell sort algorithm.
	 * @param arr	an array
	 * @author tropsara17, hudsonad17
	 */
	public static <T extends Comparable<T>> void shellSort(T[] arr) {
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
					arr[j] = arr[j-g];
				}
				arr[j] = temp;
			}
		}
	}

	/**
	 * Method sorts 	an array.
	 * @param arr		an array
	 * @param events	a linked list
	 * @author tropsara17, hudsonad17
	 */
	public static <T extends Comparable<T>>void eventSort(T[] arr, List<SortEvent<T>> events) {

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

	public static void main(String[] args) {
		Double[] doubleArray = { -2.0, 1.0, -3.0 };
		Sorts.shellSort(doubleArray);
		System.out.println(Arrays.toString(doubleArray));
	}
}
