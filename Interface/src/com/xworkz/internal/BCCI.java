package com.xworkz.internal;

public class BCCI {
	private CricketRule cricketRule;

	public void cricketRule(CricketRule cricketRule) {
		this.cricketRule = cricketRule;

	}
	
	public void check() {
		System.out.println("running CricketRulein BCCI");
		if (cricketRule != null) {
			System.out.println("cricketRule is not null");
			cricketRule.powerPlay();

		} else {
			System.out.println("cricketRule is null");
		}
	}
}
