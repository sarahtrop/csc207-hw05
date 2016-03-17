package edu.grinnell.sortingvisualizer.rendering;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

import edu.grinnell.sortingvisualizer.audio.NoteIndices;

@SuppressWarnings("serial")
public class ArrayPanel extends JPanel {

    private NoteIndices notes;
    private int totalNumNotes;
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
        this.totalNumNotes = notes.numNotes();
    }

    @Override
    public void paintComponent(Graphics g) {
    	Color currentColor;
        for (int i = 0; i < totalNumNotes; i++) {
        	if (notes.isHighlighted(i)) {
        		notes.highlightNote(i);
        		currentColor = new Color(255, 255, 0);
        	} else {
        		currentColor = new Color(0, 150, 150+(i*2));
        	}
        	int boxWidth = width / totalNumNotes;
        	int boxHeight = (i + 1) * (height-1 / totalNumNotes);
        	int x = (boxWidth * i);
        	
        	g.setColor(currentColor);
        	g.fillRect(x, 0, boxWidth, boxHeight);
        }
        notes.clearAllHighlighted();
    }
}