package com.xworkz.exception.runner;

import com.xworkz.exception.InvalidEmail;
import com.xworkz.exception.ServiceEmail;

public class ServiceRunner {

	public static void main(String[] args) throws InvalidEmail {
		// TODO Auto-generated method stub

		ServiceEmail servive = new ServiceEmail();

		servive.saveEmail("ajaydeshpande787898@.com");

		System.out.println("=============");

		servive.acceptPrice(101);

	}

}