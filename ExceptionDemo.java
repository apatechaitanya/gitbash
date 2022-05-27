class A{ 

}
class B extends A{
	
}
class ExceptionDemo{
	public static void main(String [] args)
	{
		System.out.println("Before");
		A a = new A();
		try 
		{
		B b = (B)a;
		}
		catch(Throwable e)
		{
			System.out.println("Invalilde Input ");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		finally
		{
		System.out.println("After");
		}
		// Output:
		// E:\src\OOPS>java ExceptionDemo
		// Before
		// Invalilde Input
		// java.lang.ClassCastException: A cannot be cast to B
				// at ExceptionDemo.main(ExceptionDemo.java:14)
		// A cannot be cast to B
		// After
	}
}