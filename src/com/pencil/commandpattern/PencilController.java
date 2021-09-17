package com.pencil.commandpattern;

public class PencilController {
	Command cmd;
	public PencilController() {

	}
	
	public void executecommand(Command comm)
	{
		cmd = comm;
	}
	
	public void buttonPress()
	{
		cmd.execute();
	}

}
