package com.xworkz.internal;

public class SmartWatchRunner {
	public static void main(String[] args) {
	
	SmartWatch smartWatch=new SmartWatch();
	smartWatch.setCost(15000);
	double cost=smartWatch.getCost();
	System.out.println(cost);
}
}
