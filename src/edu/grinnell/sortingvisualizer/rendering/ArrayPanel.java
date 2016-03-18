package edu.grinnell.sortingvisualizer.rendering;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

import edu.grinnell.sortingvisualizer.audio.NoteIndices;

@SuppressWarnings("serial")
public class ArrayPanel extends JPanel {

    private NoteIndices notes;
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
    }

    @Override
    public void paintComponent(Graphics g) {
    	Color currentColor;
        for (int i = 0; i < notes.numNotes(); i++) {
        	if (notes.isHighlighted(i)) {
        		currentColor = new Color(0, 10, 200);
        	} else {
        		int blueComponent = 150 + (i*3);
        		if (blueComponent > 255) { blueComponent = 255; }
        		currentColor = new Color(20, 150, blueComponent);
        	}
        	double boxWidth = width / notes.numNotes();
        	int boxHeight = (notes.getNotes()[i] + 1) * (height / notes.numNotes());
        	double x = (boxWidth * i);
        	
        	g.setColor(currentColor);
        	g.fillRect((int)x, height - boxHeight, (int)boxWidth, boxHeight);
        }
        notes.clearAllHighlighted();
    }
}