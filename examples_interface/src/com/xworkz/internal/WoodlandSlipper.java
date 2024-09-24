package com.xworkz.internal;

public class WoodlandSlipper implements slipper {

	@Override
	public void buy() {
		System.out.println("running buy in WoodlandSlipper ");
	}

	@Override
	public boolean isGood() {
		System.out.println("running isGood in WoodlandSlipper");
		return false;
	}

}
