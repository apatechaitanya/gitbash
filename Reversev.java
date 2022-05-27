import java.util.*;
class Reversev
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String str = sc.nextLine();
		String str1="";
		char ch ;
		for(int i = 0;i<str.length();i++)
		{
			ch = str.charAt(i);
			str1 = ch+str1;
		}
		System.out.println("Reverse of String :"+str1);
	}
}