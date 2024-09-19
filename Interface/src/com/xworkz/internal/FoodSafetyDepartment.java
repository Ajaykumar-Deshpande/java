package com.xworkz.internal;

public class FoodSafetyDepartment {
	private HotelRule hotelRule;

	public void setHotelRule(HotelRule hotelRule) {
		this.hotelRule = hotelRule;

	}

	public void check() {
		System.out.println("running hoteltRule in FoodSafetyDepartment");
		if (hotelRule != null) {
			System.out.println("hotelRule is not null");
			hotelRule.cleanPermises();

		} else {
			System.out.println("hotelRule is null");
		}
	}
}



















