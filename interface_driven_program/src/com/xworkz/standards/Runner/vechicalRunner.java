package com.xworkz.standards.Runner;

import com.xworkz.standards.repo.VehicleRepository;
import com.xworkz.standards.repo.VehicleRepositoryImpl;
import com.xworkz.standards.service.VechicalService;
import com.xworkz.standards.service.VechicalServiceImpl;

public class vechicalRunner {
	public static void main(String[] args) {

		VehicleRepository repository = new VehicleRepositoryImpl();

		VechicalService service = new VechicalServiceImpl(repository);

		System.out.println("VehicleServiceRunner is a runner:");
		service.persist();
		System.out.println("----------");
		service.merge();
		System.out.println("Updated....");
		System.out.println("----------");
		service.clear();
		System.out.println("Deleted....");
		System.out.println("----------");
		service.search();
		System.out.println("Readed...");
	}

}
