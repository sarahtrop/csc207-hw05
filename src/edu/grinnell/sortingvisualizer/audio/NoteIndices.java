package edu.grinnell.sortingvisualizer.audio;

import java.util.ArrayList;
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
	private boolean[] highlight;
	
    /**
     * @param n the size of the scale object that these indices map into
     */
    public NoteIndices(int n) {
        notes = new int[n];
    }
    
    /**
     * Reinitializes this collection of indices to map into a new scale object
     * of the given size.  The collection is also shuffled to provide an
     * initial starting point for the sorting process.
     * @param n the size of the scale object that these indices map into
     */
    public void initializeAndShuffle(int n) {
    	shuffle(notes);
        scale = new Scale(notes);
        highlight = new boolean[notes.length];
    }
    
    /**
     * Shuffle taken from the last homework
     * Takes an array and returns a shuffled version of that array
     * @param arr	an array of integers
     * @return		an array of integers
     * @author tropsara17, segallza
     */
    public void shuffle(int[] arr) {
    	for (int i = 0; i < arr.length; i++) {
    		arr[i] = i;
    	}
    	
    	Random rand = new Random();
    	int j;
    	int temp;
    	for (int i = arr.length - 1; i >=0; i--) {
    		j = rand.nextInt(i+1);
    		temp = arr[j];
    		arr[j] = arr[i];
    		arr[i] = temp;
    	}
	}
	
    /** @return the indices of this NoteIndices object */
    public Integer[] getNotes() { 
    	Integer[] intNotes = new Integer[notes.length];
    	for (int i = 0; i < notes.length; i++) {
    		intNotes[i] = notes[i];
    	}
        return intNotes;
    }
    
    /**
     * Highlights the given index of the note array
     * @param index the index to highlight
     */
    public void highlightNote(int index) {
    	highlight[index] = true;
    }
    
    /** @return true if the given index is highlighted */
    public boolean isHighlighted(int index) {
        return highlight[index];
    }
    
    /** Clears all highlighted indices from this collection */
    public void clearAllHighlighted() {
        for (int i = 0; i < highlight.length; i++) {
        	highlight[i] = false;
        }
    }
    
    /** @return	an int, the length of the note array*/
    public int numNotes() {
    	return notes.length;
    }
}
