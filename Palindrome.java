import java.util.*;
class Palindrome
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
		if(str.equals(str1))
		{
			System.out.println("String Is Palindrome");
		}
		else
		{
			System.out.println("String Is Not Palindrome");
		}
	}
}