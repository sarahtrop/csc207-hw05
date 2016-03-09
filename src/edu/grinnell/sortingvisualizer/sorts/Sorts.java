package edu.grinnell.sortingvisualizer.sorts;

import java.util.List;
import edu.grinnell.sortingvisualizer.events.SortEvent;

public class Sorts {

	/**
	 * Method sorts an array using selection sort algorithm.
	 * @param arr	an array
	 */
	public static <T extends Comparable<T>> void selectionSort(T[] arr) {
		for(int i = 0; i < arr.length; i++) {
			int temp = i;
			for (int j = i; j < arr.length; j++) {
				if (arr[j].compareTo(arr[temp]) < 0) {
					temp = j;
				}
			}
			swap(arr, temp, i);
		}	
	}
	
	/**
	 * Method sorts an array using insertion sort algorithm.
	 * @param arr	an array
	 */
	public static <T extends Comparable<T>> void insertionSort(T[] arr) {
		for(int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j].compareTo(arr[j-1]) < 0) {
					T temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
	}
	
	/**
	 * Method sorts an array using bubble sort algorithm.
	 * @param arr	an array
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
	 * Method sorts an array using merge sort algorithm.
	 * @param arr	an array
	 */
	public static <T extends Comparable<T>> void mergeSort(T[] arr) {
		
	}
	
	/**
	 * Method sorts an array using quick sort algorithm.
	 * @param arr	an array
	 */
	public static <T extends Comparable<T>> void quickSort(T[] arr) {
		
	}
	
	// OTHER TYPE OF SORT - our pick
	/**
	 * 
	 * @param arr	an array
	 */
	public static <T extends Comparable<T>> void otherSort(T[] arr) {
		
	}
	
	/**
	 * Method sorts 	an array.
	 * @param arr		an array
	 * @param events	a linked list
	 */
	public static <T extends Comparable<T>>void eventSort(T[] arr, List<SortEvent<T>> events) {
		
	}
	
	public static <T extends Comparable<T>> void swap (T[] arr, int j, int i) {
		T temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}
		
}
