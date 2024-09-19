package com.xworkz.standards.repo;

public class VehicleRepositoryImpl implements VehicleRepository {

	@Override
	public void save() {
		System.out.println("running save in VechicalRepositoryImpl");
	}

	@Override
	public void update() {
		System.out.println("running update in VechicalRepositoryImpl");

	}

	@Override
	public boolean delete() {
		System.out.println("running delete in VechicalRepositoryImpl");
		return false;
	}

	@Override
	public String read() {
		System.out.println("running read in VechicalRepositoryImpl");
		return null;
	}

}
