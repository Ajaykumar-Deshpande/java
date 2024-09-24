package com.xworkz.internal;

public class LedTvImpl extends LedTv {

	@Override
	public boolean isWorking() {
		System.out.println("running isWorking in LedTvImpl");
		return false;
	}

}
