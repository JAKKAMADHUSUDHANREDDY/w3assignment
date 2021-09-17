package com.pencil.commandpattern;

public class PencilCommandPatterenMain {
	
    public static void main(String[] args) {
    	
    	PencilController pc = new PencilController();
    	
    	ColorCommand cc = new ColorCommand();
    	SketchCommand sc = new SketchCommand();
    	WriteCommand wc = new WriteCommand();
    	
    	//Command pencil to do colors
    	pc.executecommand(new Color(cc));
    	pc.buttonPress();
    	//Command pencil to do not do colors
    	pc.executecommand(new DonotColor(cc));
    	pc.buttonPress();

    	
    	// Command pencil to do sketching
    	pc.executecommand(new Sketch(sc));
    	pc.buttonPress();
    	// Command pencil to do not do sketching
    	pc.executecommand(new DonotSketch(sc));
    	pc.buttonPress();

    	// Command pencil to do writing
    	pc.executecommand(new Write(wc));
    	pc.buttonPress();
    	// Command pencil to do not do writing
    	pc.executecommand(new DonotWrite(wc));
    	pc.buttonPress();


    }

}
