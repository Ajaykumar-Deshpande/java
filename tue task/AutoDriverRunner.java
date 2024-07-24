class AutoDriverRunner{
	public static void main (String[] args)
	{
		System.out.println("dtart main in AutoDriverRunner");
		
		AutoDriver autoDriver=new AutoDriver();
		int ref=autoDriver.age;
		System.out.println("autodriver :"+ref);
		
		autoDriver.age=40;
		int ref1=autoDriver.age;
		System.out.println("autodriver :"+ref1);
		
		
		//other program
		String name=AutoDriver.name;
		System.out.println("juice name :"+name);
		
		
		
		System.out.println("dtart main in AutoDriverRunner");
		
	}
}