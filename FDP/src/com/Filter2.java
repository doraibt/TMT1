package com;

public class Filter2 implements Filter {

	@Override
	public void execute(String request) {
		 System.out.println("Filter 2 Request : "+request);
		
	}

}
