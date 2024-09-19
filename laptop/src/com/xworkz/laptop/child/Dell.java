package com.xworkz.laptop.child;

import com.xworkz.laptop.parent.Laptop;

public class Dell extends Laptop {
	

	public Dell(boolean isSaved) {
		super(10,"dell");
		System.out.println("this child class constructor");
	}
	
	public Dell(boolean isSaved,int price) {
		this(false);
		//super(10);
		
		System.out.println("this 2nd child class constructor");
	}
	

	
}