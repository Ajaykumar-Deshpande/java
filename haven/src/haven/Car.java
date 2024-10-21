package haven;

public class Car {
	
	    String brand;
	    int year;
	    String color;

	    
	   public  Car() {
	        brand = "BMW";
	        year = 2000;
	        color = "Black";
	    }

	   
	     public Car(String brand, int year) {
	        this.brand = brand;
	        this.year = year;
	       
	        }

	   
	    public Car(String brand, int year, String color) {
	        this(brand,year);
	        this.color = color;
	    }

	    public void displayInfo() {
	        System.out.println("Brand: " + brand + ", Year: " + year + ", Color: " + color);
	    }
	    
	}

	