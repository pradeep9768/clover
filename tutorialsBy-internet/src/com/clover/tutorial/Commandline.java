package com.clover.tutorial;

public class Commandline {

	public static void main(String[] args) {
		
		String link=args[1];
		String[] details=link.split("de");
		String[] data=details[1].split("ad");
		 
		System.out.print(details[0]+" "+data[0]+" "+data[1]);
		
	}

}
