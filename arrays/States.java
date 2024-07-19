class States
{
public static void name(String[] stateName) 
{
	System.out.println("running name in stateName");
	
	for(int states=0;states<stateName.length;states++)
	{
		
		System.out.println(stateName[states]);
	}
	 System.out.println("****************");
		System.out.println("printing in backword direction");
		for ( int i=stateName.length-1;i>=0;i--)
		{
			System.out.println(stateName[i]);
        }
	  }
    }   








