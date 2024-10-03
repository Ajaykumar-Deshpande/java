package com.xworkz.internal;

public enum SeatType {

	RECLINEAR("A20"), PREMIUM("23"), EXECUTIVE("58");

	private String seatNo;

	SeatType(String no) {
		this.seatNo = no;

	}

	public String getSeatNo() {
		return seatNo;
	}

}
