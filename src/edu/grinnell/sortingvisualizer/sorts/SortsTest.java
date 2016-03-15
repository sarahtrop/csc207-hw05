package edu.grinnell.sortingvisualizer.sorts;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import edu.grinnell.sortingvisualizer.sortevents.SortEvent;

/**
 * Testing sorting algorithms
 * @author tropsara17, ehrhardh17 (in class), hudsonad17
 *
 */
public class SortsTest {
	List<SortEvent<Double>> selectionEvents = new ArrayList<>();
	List<SortEvent<Integer>> insertionEvents = new ArrayList<>();
	List<SortEvent<Character>> bubbleEvents = new ArrayList<>();
	List<SortEvent<String>> mergeEvents = new ArrayList<>();
	List<SortEvent<Integer>> quickEvents = new ArrayList<>();
	List<SortEvent<Double>> shellEvents = new ArrayList<>();
	
	@Test
	public void insertionSortTest() {
		Integer[] intArray = { 1, 6, 7, 4, 2, 10, 23 };
		Double[] doubleArray = { 100.0, -62.345, -8.97, 567.3, 2.1 };
		String[] stringArray = {"dog", "zebra", "lion", "rabbit", "turtle", "banana", "armadillo", "hedgehog" };
		Character[] characterArray = { 'y', 'i', 'p', 'a', 'g', 'f', 'e', 'w', 'q' };
		
		insertionEvents = Sorts.insertionSort(intArray);
		Sorts.insertionSort(doubleArray);
		Sorts.insertionSort(stringArray);
		Sorts.insertionSort(characterArray);
		
		assertEquals("Integer array: { 1, 6, 7, 4, 2, 10, 23 }", "[1, 2, 4, 6, 7, 10, 23]", Arrays.toString(intArray));
		assertEquals("Double array: { 100.0, -62.345, -8.97, 567.3, 2.1 }", "[-62.345, -8.97, 2.1, 100.0, 567.3]", Arrays.toString(doubleArray));
		assertEquals("String array: { dog, zebra, lion, rabbit, turtle, banana, armadillo, hedgehog }", 
					"[armadillo, banana, dog, hedgehog, lion, rabbit, turtle, zebra]", Arrays.toString(stringArray));
		assertEquals("Character array: { y, i, p, a, g, f, e, w, q }", "[a, e, f, g, i, p, q, w, y]", Arrays.toString(characterArray));
	}
	
	@Test
	public void selectionSortTest() {
		Integer[] intArray = { 1, 6, 7, 4, 2, 10, 23 };
		Double[] doubleArray = { 100.0, -62.345, -8.97, 567.3, 2.1 };
		String[] stringArray = {"dog", "zebra", "lion", "rabbit", "turtle", "banana", "armadillo", "hedgehog" };
		Character[] characterArray = { 'y', 'i', 'p', 'a', 'g', 'f', 'e', 'w', 'q' };
		
		Sorts.selectionSort(intArray);
		selectionEvents = Sorts.selectionSort(doubleArray);
		Sorts.selectionSort(stringArray);
		Sorts.selectionSort(characterArray);
		
		assertEquals("Integer array: { 1, 6, 7, 4, 2, 10, 23 }", "[1, 2, 4, 6, 7, 10, 23]", Arrays.toString(intArray));
		assertEquals("Double array: { 100.0, -62.345, -8.97, 567.3, 2.1 }", "[-62.345, -8.97, 2.1, 100.0, 567.3]", Arrays.toString(doubleArray));
		assertEquals("String array: { dog, zebra, lion, rabbit, turtle, banana, armadillo, hedgehog }", 
					"[armadillo, banana, dog, hedgehog, lion, rabbit, turtle, zebra]", Arrays.toString(stringArray));
		assertEquals("Character array: { y, i, p, a, g, f, e, w, q }", "[a, e, f, g, i, p, q, w, y]", Arrays.toString(characterArray));
	}
	
	@Test
	public void bubbleSortTest() {
		Integer[] intArray = { 1, 6, 7, 4, 2, 10, 23 };
		Double[] doubleArray = { 100.0, -62.345, -8.97, 567.3, 2.1 };
		String[] stringArray = {"dog", "zebra", "lion", "rabbit", "turtle", "banana", "armadillo", "hedgehog" };
		Character[] characterArray = { 'y', 'i', 'p', 'a', 'g', 'f', 'e', 'w', 'q' };
		
		Sorts.bubbleSort(intArray);
		Sorts.bubbleSort(doubleArray);
		Sorts.bubbleSort(stringArray);
		bubbleEvents = Sorts.bubbleSort(characterArray);
		
		assertEquals("Integer array: { 1, 6, 7, 4, 2, 10, 23 }", "[1, 2, 4, 6, 7, 10, 23]", Arrays.toString(intArray));
		assertEquals("Double array: { 100.0, -62.345, -8.97, 567.3, 2.1 }", "[-62.345, -8.97, 2.1, 100.0, 567.3]", Arrays.toString(doubleArray));
		assertEquals("String array: { dog, zebra, lion, rabbit, turtle, banana, armadillo, hedgehog }", 
					"[armadillo, banana, dog, hedgehog, lion, rabbit, turtle, zebra]", Arrays.toString(stringArray));
		assertEquals("Character array: { y, i, p, a, g, f, e, w, q }", "[a, e, f, g, i, p, q, w, y]", Arrays.toString(characterArray));
	}

	@Test
	public void shellSortTest() {
		Integer[] intArray = { 1, 6, 7, 4, 2, 10, 23 };
		Double[] doubleArray = { 100.0, -62.345, -8.97, 567.3, 2.1 };
		String[] stringArray = {"dog", "zebra", "lion", "rabbit", "turtle", "banana", "armadillo", "hedgehog", "puppy" };
		Character[] characterArray = { 'y', 'i', 'p', 'a', 'g', 'f', 'e', 'w', 'q' };
		
		Sorts.shellSort(intArray);
		shellEvents = Sorts.shellSort(doubleArray);
		Sorts.shellSort(stringArray);
		Sorts.shellSort(characterArray);
		
		System.out.println(Arrays.toString(doubleArray));
		
		assertEquals("Integer array: { 1, 6, 7, 4, 2, 10, 23 }", "[1, 2, 4, 6, 7, 10, 23]", Arrays.toString(intArray));
		assertEquals("Double array: { 100.0, -62.345, -8.97, 567.3, 2.1 }", "[-62.345, -8.97, 2.1, 100.0, 567.3]", Arrays.toString(doubleArray));
		assertEquals("String array: { dog, zebra, lion, rabbit, turtle, banana, armadillo, hedgehog, puppy }", 
					"[armadillo, banana, dog, hedgehog, lion, puppy, rabbit, turtle, zebra]", Arrays.toString(stringArray));
		assertEquals("Character array: { y, i, p, a, g, f, e, w, q }", "[a, e, f, g, i, p, q, w, y]", Arrays.toString(characterArray));
	}
	
	@Test
	public void mergeSortTest() {
		Integer[] intArray = { 1, 6, 7, 4, 2, 10, 23 };
		Double[] doubleArray = { 100.0, -62.345, -8.97, 567.3, 2.1 };
		String[] stringArray = {"dog", "zebra", "lion", "rabbit", "turtle", "banana", "armadillo", "hedgehog", "puppy" };
		Character[] characterArray = { 'y', 'i', 'p', 'a', 'g', 'f', 'e', 'w', 'q' };
		
		Sorts.mergeSort(intArray);
		Sorts.mergeSort(doubleArray);
		mergeEvents = Sorts.mergeSort(stringArray);
		Sorts.mergeSort(characterArray);
		
		System.out.println(Arrays.toString(doubleArray));
		
		assertEquals("Integer array: { 1, 6, 7, 4, 2, 10, 23 }", "[1, 2, 4, 6, 7, 10, 23]", Arrays.toString(intArray));
		assertEquals("Double array: { 100.0, -62.345, -8.97, 567.3, 2.1 }", "[-62.345, -8.97, 2.1, 100.0, 567.3]", Arrays.toString(doubleArray));
		assertEquals("String array: { dog, zebra, lion, rabbit, turtle, banana, armadillo, hedgehog, puppy }", 
					"[armadillo, banana, dog, hedgehog, lion, puppy, rabbit, turtle, zebra]", Arrays.toString(stringArray));
		assertEquals("Character array: { y, i, p, a, g, f, e, w, q }", "[a, e, f, g, i, p, q, w, y]", Arrays.toString(characterArray));
	}
	
	@Test
	public void quickSortTest() {
		Integer[] intArray = { 1, 6, 7, 4, 2, 10, 23 };
		Double[] doubleArray = { 100.0, -62.345, -8.97, 567.3, 2.1 };
		String[] stringArray = {"dog", "zebra", "lion", "rabbit", "turtle", "banana", "armadillo", "hedgehog", "puppy" };
		Character[] characterArray = { 'y', 'i', 'p', 'a', 'g', 'f', 'e', 'w', 'q' };
		
		Sorts.quickSort(intArray);
		Sorts.quickSort(doubleArray);
		Sorts.quickSort(stringArray);
		Sorts.quickSort(characterArray);
		
		System.out.println(Arrays.toString(doubleArray));
		
		assertEquals("Integer array: { 1, 6, 7, 4, 2, 10, 23 }", "[1, 2, 4, 6, 7, 10, 23]", Arrays.toString(intArray));
		assertEquals("Double array: { 100.0, -62.345, -8.97, 567.3, 2.1 }", "[-62.345, -8.97, 2.1, 100.0, 567.3]", Arrays.toString(doubleArray));
		assertEquals("String array: { dog, zebra, lion, rabbit, turtle, banana, armadillo, hedgehog, puppy }", 
					"[armadillo, banana, dog, hedgehog, lion, puppy, rabbit, turtle, zebra]", Arrays.toString(stringArray));
		assertEquals("Character array: { y, i, p, a, g, f, e, w, q }", "[a, e, f, g, i, p, q, w, y]", Arrays.toString(characterArray));
	}

	@Test
	public void eventSortTest() {
		Integer[] intArray = { 1, 6, 7, 4, 2, 10, 23 };
		Integer[] intArray2 = { 10, 11, 87, 93, 2 };
		Double[] doubleArray = { 100.0, -62.345, -8.97, 567.3, 2.1 };
		Double[] doubleArray2 = { -7.0, 9.3, 4.5, 2.12, 98.4 };
		String[] stringArray = {"dog", "zebra", "lion", "rabbit", "turtle", "banana", "armadillo", "hedgehog", "puppy" };
		Character[] characterArray = { 'y', 'i', 'p', 'a', 'g', 'f', 'e', 'w', 'q' };
		
		
		Sorts.eventSort(intArray, insertionEvents);
		Sorts.eventSort(doubleArray, selectionEvents);
		Sorts.eventSort(stringArray, mergeEvents);
		Sorts.eventSort(characterArray, bubbleEvents);
		Sorts.eventSort(intArray2, quickEvents);
		Sorts.eventSort(doubleArray2, shellEvents);
		
		System.out.println(Arrays.toString(doubleArray));
		
		assertEquals("Insertion: { 1, 6, 7, 4, 2, 10, 23 }", "[1, 2, 4, 6, 7, 10, 23]", Arrays.toString(intArray));
		assertEquals("Selection: { 100.0, -62.345, -8.97, 567.3, 2.1 }", "[-62.345, -8.97, 2.1, 100.0, 567.3]", Arrays.toString(doubleArray));
		assertEquals("Merge: { dog, zebra, lion, rabbit, turtle, banana, armadillo, hedgehog, puppy }", 
					"[armadillo, banana, dog, hedgehog, lion, puppy, rabbit, turtle, zebra]", Arrays.toString(stringArray));
		assertEquals("Bubble: { y, i, p, a, g, f, e, w, q }", "[a, e, f, g, i, p, q, w, y]", Arrays.toString(characterArray));
		assertEquals("Quick: { 10, 11, 87, 93, 2 }", "[2, 10, 11, 87, 93]", Arrays.toString(intArray2));
		assertEquals("Shell: { -7.0, 9.3, 4.5, 2.12, 98.4 }", "[-7.0, 2.12, 4.5, 9.3, 98.4]", Arrays.toString(doubleArray2));
	}

}
