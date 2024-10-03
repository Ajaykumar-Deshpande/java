package com.xworkz.runner;

import com.xworkz.dto.CoustmerDto;
import com.xworkz.internal.ProductType;

public class CoustmerDtoRunner {
	public static void main(String[] args) {
		CoustmerDto coustmerDto = new CoustmerDto("ajay", "ajay@gmail.com", ProductType.FOOTWERE);
		String name = coustmerDto.getName();
		String email = coustmerDto.getEmail();
		ProductType productType = coustmerDto.getProductType();
		System.out.println("name : " + name + " email : " + email + " ProductType : " + productType);

	}

}
