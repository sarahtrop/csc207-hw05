package edu.grinnell.sortingvisualizer.audio;

import java.util.Random;

/**
 * A collection of indices into a Scale object.
 * These indices are the subject of the various sorting algorithms
 * in the program.
 */
public class NoteIndices {
	
	private Integer[] notes;
	private boolean[] highlight;
	
    /**
     * @param n the size of the scale object that these indices map into
     */
    public NoteIndices(int n) {
    	initializeAndShuffle(n);
    }
    
    /**
     * Reinitializes this collection of indices to map into a new scale object
     * of the given size.  The collection is also shuffled to provide an
     * initial starting point for the sorting process.
     * @param n the size of the scale object that these indices map into
     */
    public void initializeAndShuffle(int n) {
    	notes = new Integer[n];
    	shuffle(notes);
        highlight = new boolean[notes.length];
    }
    
    /**
     * Shuffle taken from the last homework
     * Takes an array and returns a shuffled version of that array
     * @param notes2	an array of integers
     * @return		an array of integers
     * @author hudsonad17
     */
    public void shuffle(Integer[] notes2) {
    	for (int i = 0; i < notes2.length; i++) {
    		notes2[i] = i;
    	}
    	Random rand = new Random();
    	int j;
    	int temp;
    	for (int i = notes2.length - 1; i >=0; i--) {
    		j = rand.nextInt(i+1);
    		temp = notes2[j];
    		notes2[j] = notes2[i];
    		notes2[i] = temp;
    	}
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
