package edu.grinnell.sortingvisualizer.rendering;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

import edu.grinnell.sortingvisualizer.audio.NoteIndices;

@SuppressWarnings("serial")
public class ArrayPanel extends JPanel {

    private NoteIndices notes;
    private int numNotes;
    private int width, height;
    
    /**
     * Constructs a new ArrayPanel that renders the given note indices to
     * the screen.
     * @param notes the indices to render
     * @param width the width of the panel
     * @param height the height of the panel
     */
    public ArrayPanel(NoteIndices notes, int width, int height) {
        this.notes = notes;
        this.setPreferredSize(new Dimension(width, height));
        this.width = width;
        this.height = height;
        this.numNotes = notes.numNotes();
    }

    @Override
    public void paintComponent(Graphics g) {
    	int boxWidth = width / numNotes;
    	int boxHeight;
    	int heightFraction;
    	Color currentColor;
        for (int i = 0; i< numNotes; i++) {
        	if (notes.isHighlighted(i)) {
        		notes.highlightNote(i);
        		currentColor = new Color(255, 255, 100);
        	} else {
        		currentColor = new Color(128, 150, 150+(i*2));
        	}
        	heightFraction = height-1 / numNotes;
        	if (i != 0) { boxHeight = i * heightFraction; }
        	else { boxHeight = heightFraction; }
        	int x = boxWidth + (boxWidth * i);
        	
        	g.setColor(currentColor);
        	g.fillRect(x, 0, boxWidth, boxHeight);
        }
        notes.clearAllHighlighted();
    }
}