package com.pencil.commandpattern;

public class DonotSketch implements Command {

	SketchCommand sketch;

	public DonotSketch(SketchCommand sketch){
		this.sketch = sketch;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		sketch.donotSketch();
		
	}
}