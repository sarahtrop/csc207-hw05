package edu.grinnell.sortingvisualizer.sorts;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import edu.grinnell.sortingvisualizer.sortevents.CompareEvent;
import edu.grinnell.sortingvisualizer.sortevents.SortEvent;
import edu.grinnell.sortingvisualizer.sortevents.SwapEvent;

public class Sorts {
	
	/**
	 * Method sorts an array in ascending order using the selection sort algorithm.
	 * @param arr	an array
	 * @author tropsara17, ehrhardh17
	 */
	public static <T extends Comparable<T>> void selectionSort(T[] arr) {
		for(int i = 0; i < arr.length; i++) {
			int temp = i;
			for (int j = i; j < arr.length; j++) {
				if (arr[j].compareTo(arr[temp]) < 0) {
					new CompareEvent<>(i, j);
					temp = j;
				}
			}
			swap(arr, temp, i);
		}	
	}
	
	/**
	 * Method sorts an array in ascending using the insertion sort algorithm.
	 * @param arr	an array
	 * @author tropsara17, ehrhardh17
	 */
	public static <T extends Comparable<T>> void insertionSort(T[] arr) {
		for(int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j].compareTo(arr[j-1]) < 0) {
					new CompareEvent<>(i, j);
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
					new CompareEvent<>(i, j);
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
		mergeSortHelper(arr, 0, arr.length);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends Comparable<T>> void mergeSortHelper(T[] arr, int lo, int hi) {
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
				newArray[n] = arr[lowerBound];
				lowerBound++;
			} else {
				newArray[n] = arr[middle];
				middle++;
			}
		}
		for (int m = lo; m < hi; m++) {
			arr[m] = (T)newArray[m-lo];
		}
	}
	
	/**
	 * Method sorts an array in ascending order using the quick sort algorithm.
	 * @param arr	an array
	 * @author tropsara17, ehrhardh17
	 */
	public static <T extends Comparable<T>> void quickSort(T[] arr) {
		quickSortHelper(arr, 0, arr.length);
	}
	
	public static <T extends Comparable<T>> void quickSortHelper(T[] arr, int lo, int hi) {
		Random r = new Random();
		int index = r.nextInt(hi - lo) + lo;
		T pivot = arr[index];
		int front = lo;
		int back = hi - 2;
		swap(arr, index, hi - 1);
		
		while(front != back) {
			while (arr[front].compareTo(pivot) < 0) { front++; }
			while (arr[back].compareTo(pivot) > 0) { back--; }
			swap(arr, front, back);
		}
	
		if (arr[front].compareTo(pivot) > 0) { swap(arr, hi, front); }
		else { swap(arr, hi, front + 1); }
		 
		if (front - lo > 1) { quickSortHelper(arr, lo, front); }
		if (hi - front > 1) { quickSortHelper(arr, front, hi); }
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
					new CompareEvent<>(i, j);
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
		new SwapEvent<>(i, j);
	}

	public static void main(String[] args) {
		Double[] doubleArray = { -2.0, 1.0, -3.0 };
		Sorts.shellSort(doubleArray);
		System.out.println(Arrays.toString(doubleArray));
	}
}
