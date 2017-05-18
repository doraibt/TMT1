package com;

public class Filter1 implements Filter {
	   public void execute(String request){
		      System.out.println("Filter 1 request: " + request);
		   }
		}