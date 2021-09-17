package com.pencil.commandpattern;

public class Sketch implements Command {

	SketchCommand sketch;

	public Sketch(SketchCommand sketch){
		this.sketch = sketch;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		sketch.sketch();
		
	}
}