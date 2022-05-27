import java.util.*;
class countDemo
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String count = sc.nextLine();
		int num = 0;
		for(int i =0;i<count.length()-1;i++)
		{
			if(count.charAt(i)=='1' && count.charAt(i+1) =='0')
			{
				num++;
			}
		}
		System.out.println(num);
	}
}