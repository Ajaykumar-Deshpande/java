package com.xworkz.dto;

import com.xworkz.internal.SeatType;
import com.xworkz.internal.TicketType;

public class TicketBookDto {
	private String moviename;
	private String theatername;
	private TicketType ticketType;
	private SeatType seatType;

	public TicketBookDto(String moviename, String theatername, TicketType ticketType, SeatType seatType) {
		super();
		this.moviename = moviename;
		this.theatername = theatername;
		this.ticketType = ticketType;
		this.seatType=seatType;

	}

	public SeatType getSeatType() {
		return seatType;
	}

	public String getMoviename() {
		return moviename;
	}

	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}

	public String getTheatername() {
		return theatername;
	}

	public void setTheatername(String theatername) {
		this.theatername = theatername;
	}

	public TicketType getTicketType() {
		return ticketType;
	}

	public void setTicketType(TicketType ticketType) {
		this.ticketType = ticketType;
	}

}
