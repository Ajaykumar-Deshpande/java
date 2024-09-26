package com.xworkz.exception;

import com.xworkz.exception.*;

public class ServiceEmail {

	public void saveEmail(String email) throws InvalidEmail {

		if (email == null || !email.endsWith(".com") || !email.contains("@"))
			throw new InvalidEmail();

		else
			System.out.println("Email saved: " + email);

	}

	public void acceptPrice(double price) {
		if (price < 100)
			throw new InvalidPrice();

		else
			System.out.println("Price Accepted : " + price);
	}

}