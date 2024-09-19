package com.xworkz.standards.Runner;

import com.xworkz.standards.repo.AddressRepository;
import com.xworkz.standards.repo.AddressRepositoryImpl;
import com.xworkz.standards.service.AddressService;
import com.xworkz.standards.service.*;

public class AddressRunner {
	public static void main(String[] args) {

		AddressRepository repository = new AddressRepositoryImpl();

		AddressService service = new AddressServiceImpl(repository);
		boolean check = service.push();
		System.out.println(check);
		System.out.println("******");
		int no = service.refresh();
		System.out.println(no);
		System.out.println("----------");

		service.remove();
		System.out.println("remove this msg");

		String msg = service.load();
		System.out.println(msg);

	}

}
