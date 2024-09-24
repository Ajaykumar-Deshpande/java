package com.xworkz.internal;

public interface AirportRules {
	void open();

	default int noOfWorkers() {
		return 100;
	}

}
