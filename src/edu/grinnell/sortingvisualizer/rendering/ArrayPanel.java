package edu.grinnell.sortingvisualizer.rendering;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

import edu.grinnell.sortingvisualizer.audio.NoteIndices;

@SuppressWarnings("serial")
public class ArrayPanel extends JPanel {

    private NoteIndices notes;
    
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
    }

    @Override
    public void paintComponent(Graphics g) {
    	Color currentColor;
    	Integer[] colorNotes = notes.getNotes();
        for (int i = 0; i< colorNotes.length; i++) {
        	if (colorNotes[i].isHighlighted()) {
        		highlightNote(colorNotes[i]);
        		currentColor = new Color(255, 255, 100);
        	} else {
        		currentColor = new Color(128, 150, 150+(i*2));
        	}
        	g.setColor(currentColor);
        }
        colorNotes.clearAllHighlighted();
    }
}