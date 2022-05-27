import java.io.*;
class A{
	void m1() throws FileNotFoundException{
		
	}
}
class B extends A{
	@Override
	void m1() throws FileNotFoundException
	{
		super.m1();	
	}
}
class ExceptionDemo4{
	public static void main(String [] args)
	{
		A a = new B();
		try{
			a.m1();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Finally");
		}
		//a.m1();
	}
}