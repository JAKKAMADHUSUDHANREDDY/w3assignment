package com.pencil.commandpattern;

public class Color  implements Command {

	ColorCommand color;

	public Color(ColorCommand color){
		this.color = color;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		color.doColor();
		
	}


}
