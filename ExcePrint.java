import java.io.*;
class ExcePrint
{
	public static void main(String [] args)
	{
		try
		{
			int a = 1/0;
			System.out.println(a);
		}
		catch(Throwable e)
		{			
			e.printStackTrace();
			System.out.println(e);
			System.out.println(e.toString());
			System.out.println(e.getMessage());
		}
	}
}