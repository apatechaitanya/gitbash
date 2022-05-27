class ANE{
	void m1()
	{
		System.out.println("m1 invoked");
	}
}

class NullPointerException
{
	public static void main(String... args)
	{
		System.out.println("Before");
				ANE a = null;		

		try{
		a.m1();  //NPE
		}
		catch(Throwable e)
		{
			System.out.println("Null he bhaii");
		}
		System.out.println("After");
	}
}