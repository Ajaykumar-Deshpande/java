package com.xworkz.dto;

import com.xworkz.internal.ProductType;

public class CoustmerDto {
	private String name;
	private String email;
	private ProductType productType;

	public CoustmerDto(String name, String email, ProductType productType) {
		super();
		this.name = name;
		this.email = email;
		this.productType = productType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ProductType getProductType() {
		return productType;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}

}
