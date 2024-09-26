package com.xworkz.methods;

public class StudentRunner {
	
	public static void main(String[] args) {
		
		
		Student student=new Student();
		
		Student student2=new Student();
		
		
		
	
		
		student.setName("deepak");
		student.setUsn(0);
		String ref=student.getName();
	
		student2.setName("deepak");
		student2.setUsn(0);
		String ref2=student2.getName();
		
		System.out.println(student.hashCode());
		System.out.println(student2.hashCode());
		
		//System.out.println(student2.getClass());
		
		boolean ref4=student.equals(student2);
		
		System.out.println(ref4);
		
		
	
		
	}
	


}
