package com.xworkz.standards.service;

import com.xworkz.standards.repo.AddressRepository;

public class AddressServiceImpl implements AddressService {
	AddressRepository addressRepository;
	

	public AddressServiceImpl(AddressRepository addressRepository) {
		super();
		this.addressRepository = addressRepository;
	}

	@Override
	public boolean push() {
		if (addressRepository != null) {
			boolean saved = addressRepository.save();
			if (saved) {
				System.out.println("Saved Successfully");
				return true;
			}
		} else {
			System.out.println("Failed");
		}

		return false;
	}

	@Override
	public int refresh() {
		if (addressRepository != null) {
			int ver = addressRepository.update();
			if (ver > 1) {
				System.out.println("Updated Status");
				return ver;
			}
		} else {
			System.out.println("cannot Update");
		}

		return 0;
	}

	@Override
	public void remove() {
		if (addressRepository != null) {
			System.out.println("address Repository is Not Null");
			addressRepository.delete();
		} else {
			System.out.println("address Repository is Null");
		}

	}

	@Override
	public String load() {
		if (addressRepository != null) {

			addressRepository.read();
			return "Success";
		} else {
			System.out.println("address Repository is Null");
		}
		return "Failed";
	}

}
