package edu.grinnell.sortingvisualizer.sorts;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class SortsTest {
	
	@Test
	public void insertionSortTest() {
		Integer[] intArray = { 1, 6, 7, 4, 2, 10, 23 };
		Double[] doubleArray = { 100.0, -62.345, -8.97, 567.3, 2.1 };
		String[] stringArray = {"dog", "zebra", "lion", "rabbit", "turtle", "banana", "armadillo", "hedgehog" };
		Character[] characterArray = { 'y', 'i', 'p', 'a', 'g', 'f', 'e', 'w', 'q' };
		
		Sorts.insertionSort(intArray);
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
		Sorts.selectionSort(doubleArray);
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
		Sorts.bubbleSort(characterArray);
		
		assertEquals("Integer array: { 1, 6, 7, 4, 2, 10, 23 }", "[1, 2, 4, 6, 7, 10, 23]", Arrays.toString(intArray));
		assertEquals("Double array: { 100.0, -62.345, -8.97, 567.3, 2.1 }", "[-62.345, -8.97, 2.1, 100.0, 567.3]", Arrays.toString(doubleArray));
		assertEquals("String array: { dog, zebra, lion, rabbit, turtle, banana, armadillo, hedgehog }", 
					"[armadillo, banana, dog, hedgehog, lion, rabbit, turtle, zebra]", Arrays.toString(stringArray));
		assertEquals("Character array: { y, i, p, a, g, f, e, w, q }", "[a, e, f, g, i, p, q, w, y]", Arrays.toString(characterArray));
	}
	
	@Test
	public void mergeSortTest() {
		Integer[] intArray = { 1, 6, 7, 4, 2, 10, 23 };
		Double[] doubleArray = { 100.0, -62.345, -8.97, 567.3, 2.1 };
		String[] stringArray = {"dog", "zebra", "lion", "rabbit", "turtle", "banana", "armadillo", "hedgehog" };
		Character[] characterArray = { 'y', 'i', 'p', 'a', 'g', 'f', 'e', 'w', 'q' };
		
		Sorts.mergeSort(intArray);
		Sorts.mergeSort(doubleArray);
		Sorts.mergeSort(stringArray);
		Sorts.mergeSort(characterArray);
		
		assertEquals("Integer array: { 1, 6, 7, 4, 2, 10, 23 }", "[1, 2, 4, 6, 7, 10, 23]", Arrays.toString(intArray));
		assertEquals("Double array: { 100.0, -62.345, -8.97, 567.3, 2.1 }", "[-62.345, -8.97, 2.1, 100.0, 567.3]", Arrays.toString(doubleArray));
		assertEquals("String array: { dog, zebra, lion, rabbit, turtle, banana, armadillo, hedgehog }", 
					"[armadillo, banana, dog, hedgehog, lion, rabbit, turtle, zebra]", Arrays.toString(stringArray));
		assertEquals("Character array: { y, i, p, a, g, f, e, w, q }", "[a, e, f, g, i, p, q, w, y]", Arrays.toString(characterArray));
	}

}
