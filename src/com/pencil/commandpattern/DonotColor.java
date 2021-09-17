package com.pencil.commandpattern;

public class DonotColor implements Command {

	ColorCommand color;

	public DonotColor(ColorCommand color){
		this.color = color;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		color.donotColor();
		
	}
}

