package com.xworkz.runner;

import com.xworkz.internal.*;



public class HotelRunner {
			public static void main(String[] args) {
				HotelRule hotelRunner = new CanaraHotelRule();
				FoodSafetyDepartment foodSafetyDepartment = new FoodSafetyDepartment();
				foodSafetyDepartment.setHotelRule(hotelRunner);
				foodSafetyDepartment.check();
		}

}
