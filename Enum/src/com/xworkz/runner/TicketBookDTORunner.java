package com.xworkz.runner;

import com.xworkz.dto.TicketBookDto;
import com.xworkz.internal.*;

public class TicketBookDTORunner {
	public static void main(String[] args) {
		TicketBookDto bookDTO = new TicketBookDto("Salaar", "Bhavani", TicketType.OFFLINE, SeatType.EXECUTIVE);
		String movieName = bookDTO.getMoviename();
		String theaterName = bookDTO.getTheatername();
		TicketType type = bookDTO.getTicketType();
		SeatType seatType = bookDTO.getSeatType();
		int price = type.getPrice();
		String seatNo = seatType.getSeatNo();

		System.out.println("movieName : " + movieName + " theaterName : " + theaterName + " TicketType : " + type
				+ " SeatType : " + seatType);
		System.err.println("TicketPrice : " + price);
		System.err.println("SeatNo : " + seatNo);
	}

}
