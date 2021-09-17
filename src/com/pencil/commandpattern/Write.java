package com.pencil.commandpattern;

public class Write implements Command {

	WriteCommand write;

	public Write(WriteCommand write){
		this.write = write;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		write.write();
		
	}

	
}
