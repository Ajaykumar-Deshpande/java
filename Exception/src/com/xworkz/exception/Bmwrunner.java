package com.xworkz.exception;


public class Bmwrunner {

	public static void main(String[] args)throws Exception {
		
		BMW bmw=new BMW();
		
		try {
		bmw.setColor("red");
		}
		catch(Car e) {
			System.out.println("exception occured");
		}
	}

}

