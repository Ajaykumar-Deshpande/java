package com.xworkz.books.internal;

public interface Book {
	
	public static final int price = 0;
	
	void bookName();
	
	public static void shopName() {
		System.out.println("this is books interface");
	}
	
	String address();

}
