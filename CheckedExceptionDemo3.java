import java.io.*;
class CheckedExceptionDemo2
{
	static void m() throws FileNotFoundException
	{
		System.out.println("1");
		File f = new File("abc.txt");
		FileReader fr = new FileReader(f);
		System.out.println("2");
	}
	public static void main(String [] args)
	{
		m();
	}
}