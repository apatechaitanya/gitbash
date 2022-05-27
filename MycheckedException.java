import java.io.*;
 
class MyException extends Exception
{
	String excpMsg;
		public MyException()
		{
			excpMsg = "This is MyException default message";
			//super(excpMsg);
		}
		public MyException(String excpMsg)
		{
			super(excpMsg);
			this.excpMsg = excpMsg;
		}
} 
class MycheackedException 
{
	public static void fun() throws MyException
	{
		throw new MyException("exception is thorwn to test");
	}
	public static void main(String[] args)
	{
		try{
			fun();
		}catch(Throwable e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Terminating the application succefully");
	}
}