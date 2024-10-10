package com.xworkz.dto;

public class ProductDTO {
	int id;
	String name;
	String vandor;
	double cost;

	public ProductDTO(int id, String name, String vandor, double cost) {
		super();
		this.id = id;
		this.name = name;
		this.vandor = vandor;
		this.cost = cost;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getVandor() {
		return vandor;
	}

	public double getCost() {
		return cost;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(cost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((vandor == null) ? 0 : vandor.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductDTO other = (ProductDTO) obj;
		if (Double.doubleToLongBits(cost) != Double.doubleToLongBits(other.cost))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (vandor == null) {
			if (other.vandor != null)
				return false;
		} else if (!vandor.equals(other.vandor))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ProductDTO [id=" + id + ", name=" + name + ", vandor=" + vandor + ", cost=" + cost + "]";
	}

	public int compareTo(ProductDTO ref1) {
		// TODO Auto-generated method stub
		return Double.compare(this.cost, ref1.cost);
	}

}
