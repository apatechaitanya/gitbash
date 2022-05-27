import java.io.*;
class CheckedExceptionDemo1
{
	public static void main(String [] args) throws FileNotFoundException
	{
		System.out.println("1");
		File f = new File("abc.txt");
		FileReader fr = new FileReader(f);
		System.out.println("2");
	}
}