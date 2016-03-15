package edu.grinnell.sortingvisualizer;

import java.util.Arrays;
import java.util.Random;

/**
 * A collection of indices into a Scale object.
 * These indices are the subject of the various sorting algorithms
 * in the program.
 */
public class NoteIndices {
	
	private int[] notes;
	private Scale scale;
	
    /**
     * @param n the size of the scale object that these indices map into
     */
    public NoteIndices(int n) {
        notes = new Integer[n];
    }
    
    /**
     * Reinitializes this collection of indices to map into a new scale object
     * of the given size.  The collection is also shuffled to provide an
     * initial starting point for the sorting process.
     * @param n the size of the scale object that these indices map into
     */
    public void initializeAndShuffle(int n) {
    	notes = shuffle(notes);
        scale = new Scale(notes);
    }
    
    /**
     * Shuffle taken from the last homework
     * Takes an array and returns a shuffled version of that array
     * @param arr	an array of integers
     * @return		an array of integers
     * @author tropsara17, segallza
     */
    public int[] shuffle(int[] arr) {
		Random random = new Random();
		
		int[] copy = new int[arr.length];
		copy = Arrays.copyOf(arr, arr.length);
		int[] randomized = new int[arr.length];
		
		int tail = arr.length;
		for(int i=0; i<tail; i++) {
			int k = random.nextInt(tail);
			randomized[i] = copy[k];
			tail = remove(copy, k);
		}
		return randomized;
	}
    /*
     * Written in Data Structures lab a long time ago.
     */
	public int remove(int[] arr, int index) {
		int tail = arr.length;
		for (int i = index; i < tail-1; i++) {
			arr[i] = arr[i+1];
		}
		tail--;
		return tail;
	}
	
    /** @return the indices of this NoteIndices object */
    public Integer[] getNotes() { 
        return notes;
    }
    
    /**
     * Highlights the given index of the note array
     * @param index the index to highlight
     */
    public void highlightNote(int index) {
        // TODO: fill me in
    }
    
    /** @return true if the given index is highlighted */
    public boolean isHighlighted(int index) {
        // TODO: fill me in
        return false;
    }
    
    /** Clears all highlighted indices from this collection */
    public void clearAllHighlighted() {
        // TODO: fill me in
    }
}
