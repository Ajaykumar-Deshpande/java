package com.xworkz.exception;

public class BMW {
	String color;
	
	public void setColor(String color) throws Car{
		
		if(color==null) {
			throw new Car();
		}
		else {
			System.out.println("color is valid");
		}
	}
	

}