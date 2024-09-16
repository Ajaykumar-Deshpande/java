package com.xworkz.Collage;

public class Branch {
	
		
		private Branch(long c) {
			System.out.println("this is Branch constructor"+c);
		}
		
		public Branch(String name,long a) {
			this(10);
			System.out.println("this is second constructor"+a +name);
		}

		

}
