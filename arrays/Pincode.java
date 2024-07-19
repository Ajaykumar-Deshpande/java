class Pincode
{
    public static void Pincodes(int[] Pincodename)
    {
        System.out.println("running pincodes in pincode");
        for ( int i=0;i<Pincodename.length;i++)
        {
            System.out.println(Pincodename[i]);
        }
        System.out.println("****************");
		System.out.println("printing in backword direction");
		for ( int i=Pincodename.length-1;i>=0;i--)
		{
			System.out.println(Pincodename[i]);
        }
	  }
    }   
    