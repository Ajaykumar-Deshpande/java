package com.xworkz.standards.Runner;

import com.xworkz.standards.repo.MachineRepository;
import com.xworkz.standards.repo.MachineRepositoryImpl;
import com.xworkz.standards.service.MachineService;
import com.xworkz.standards.service.MachineServiceImpl;

public class MachineServiceRunner {
	public static void main(String[] args) {

		MachineRepository repository = new MachineRepositoryImpl();

		MachineService service = new MachineServiceImpl(repository);

		System.out.println("\nTesting MachineService:");
		service.save();
		System.out.println("----------");
		service.update();
		System.out.println("Updated....");
		System.out.println("----------");
		service.delete();
		System.out.println("Deleted....");
		System.out.println("----------");
		service.read();
		System.out.println("Readed...");
	}

}
