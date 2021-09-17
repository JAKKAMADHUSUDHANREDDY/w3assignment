package com.pencil.commandpattern;

public class DonotWrite implements Command {

	WriteCommand write;

	public DonotWrite(WriteCommand write){
		this.write = write;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		write.donotWrite();
		
	}
}