package com.xworkz.runner;

import com.xworkz.internal.BCCI;
import com.xworkz.internal.CricketRule;
import com.xworkz.internal.KaCricketImpl;

public class CricketRunner {
	public static void main(String[] args) {
		CricketRule cricketRule = new KaCricketImpl();
		BCCI bcci = new BCCI();
		bcci.cricketRule(cricketRule);
		bcci.check();
	}
}
