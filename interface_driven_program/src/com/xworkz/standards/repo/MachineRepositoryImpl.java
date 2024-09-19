package com.xworkz.standards.repo;

public class MachineRepositoryImpl implements MachineRepository {

	@Override
	public void save() {
		System.out.println("Machine saved.");		
	}

	@Override
	public int update() {
		System.out.println("Machine updated.");	
		return 0;
	}

	@Override
	public int delete() {
		 System.out.println("Machine deleted.");
		 return 0;
	}

	@Override
	public int read() {
		 System.out.println("Machine read.");
		 return 0;
	}

}
