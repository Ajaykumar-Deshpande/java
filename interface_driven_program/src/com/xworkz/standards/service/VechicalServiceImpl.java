package com.xworkz.standards.service;

import com.xworkz.standards.repo.*;

public class VechicalServiceImpl implements VechicalService {
	private VehicleRepository vechicalRepository;

	public VechicalServiceImpl(VehicleRepository vechicalRepository) {
		super();
		this.vechicalRepository = vechicalRepository;
	}

	@Override
	public void persist() {
		if (vechicalRepository != null) {
			System.out.println("Save is not null");
			vechicalRepository.save();
		} else {
			System.out.println("Save is null");

		}
	}

	@Override
	public void merge() {
		if (vechicalRepository != null) {
			System.out.println("update is not null");
			vechicalRepository.update();
		} else {
			System.out.println("update is null");
		}

	}

	@Override
	public boolean clear() {
		if (vechicalRepository != null) {
			System.out.println("delete is not null");
			boolean delete = vechicalRepository.delete();
			if (delete) {
				return true;
			} else
				return false;
		} else {
			System.out.println("delete is null");
			return false;
		}
	}

	@Override
	public String search() {
		if (vechicalRepository != null) {
			System.out.println("read is not null");
			String ref = vechicalRepository.read();
			if (ref != null) {
				return "success";
			} else
				return "failure";
		} else {
			System.out.println("read is null");
			return "issue";
		}

	}
}
