package com.xworkz.laptop.parent;

public class Laptop {

	public Laptop() {
		
		System.out.println("this is parent no args constructor");
	}
	
	public Laptop(int a) {
	
	System.out.println("this parent parameterized constructor"+a);
		
		
	}
	
	public Laptop(int b,String name) {
		
	System.out.println("thi s parameterized constructor"+name);
		
		
	}
	
	
	
	
	
	public void laptopName() {
		System.out.println("this is parent class");
	}
}
