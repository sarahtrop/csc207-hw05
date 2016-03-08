package edu.grinnell.sortingvisualizer.sorts;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.Arrays;

public class SortsTest {

	@Test
	public void selectionSortTest() {
		// Declare arrays
		Integer[] arr = { 1, 10, 9, 8, 4, 3, 7 };
		Integer[] arrSorted = { 1, 3, 4, 7, 8, 9, 10 };
		String[] arr2 = { "d", "a", "f", "z" };
		String[] arr2Sorted = { "a", "d", "f", "z" };
		
		// Sort arrays
		Sorts.selectionSort(arr);
		Sorts.selectionSort(arr2);

		assertEquals("Integer array: { 1, 10, 9, 8, 4, 3, 7 }", arrSorted, arr);
		assertEquals("Integer array: { 1, 10, 9, 8, 4, 3, 7 }", arr2Sorted, arr2);
	}
	
	@Test
	public void insertionSortTest() {
		// Declare arrays
		Integer[] arr = { 1, 10, 9, 8, 4, 3, 7 };
		Integer[] arrSorted = { 1, 3, 4, 7, 8, 9, 10 };
		String[] arr2 = { "d", "a", "f", "z" };
		String[] arr2Sorted = { "a", "d", "f", "z" };
		
		// Sort arrays
		Sorts.insertionSort(arr);
		Sorts.insertionSort(arr2);
		
		// Check arrays
		assertEquals("Integer array: { 1, 10, 9, 8, 4, 3, 7 }", arrSorted, arr);
		assertEquals("Integer array: { 1, 10, 9, 8, 4, 3, 7 }", arr2Sorted, arr2);
	}
	
	@Test
	public void bubbleSortTest() {
		// Declare arrays
		Integer[] arr = { 1, 10, 9, 8, 4, 3, 7 };
		Integer[] arrSorted = { 1, 3, 4, 7, 8, 9, 10 };
		String[] arr2 = { "d", "a", "f", "z" };
		String[] arr2Sorted = { "a", "d", "f", "z" };
		
		// Sort arrays
		Sorts.bubbleSort(arr);
		Sorts.bubbleSort(arr2);
		
		// Check arrays
		assertEquals("Integer array: { 1, 10, 9, 8, 4, 3, 7 }", arrSorted, arr);
		assertEquals("Integer array: { 1, 10, 9, 8, 4, 3, 7 }", arr2Sorted, arr2);
	}
	
	@Test
	public void mergeSortTest() {
		// Declare arrays
		Integer[] arr = { 1, 10, 9, 8, 4, 3, 7 };
		Integer[] arrSorted = { 1, 3, 4, 7, 8, 9, 10 };
		String[] arr2 = { "d", "a", "f", "z" };
		String[] arr2Sorted = { "a", "d", "f", "z" };
		
		// Sort arrays
		Sorts.selectionSort(arr);
		Sorts.selectionSort(arr2);
		
		// Check arrays
		assertEquals("Integer array: { 1, 10, 9, 8, 4, 3, 7 }", arrSorted, arr);
		assertEquals("Integer array: { 1, 10, 9, 8, 4, 3, 7 }", arr2Sorted, arr2);
	}
	
	@Test
	public void quickSortTest() {
		// Declare arrays
		Integer[] arr = { 1, 10, 9, 8, 4, 3, 7 };
		Integer[] arrSorted = { 1, 3, 4, 7, 8, 9, 10 };
		String[] arr2 = { "d", "a", "f", "z" };
		String[] arr2Sorted = { "a", "d", "f", "z" };
		
		// Sort arrays
		Sorts.quickSort(arr);
		Sorts.quickSort(arr2);
		
		// Check arrays
		assertEquals("Integer array: { 1, 10, 9, 8, 4, 3, 7 }", arrSorted, arr);
		assertEquals("Integer array: { 1, 10, 9, 8, 4, 3, 7 }", arr2Sorted, arr2);
	}

}
