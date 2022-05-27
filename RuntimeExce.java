import java.io.*;
import java.util.Scanner;
class UnderAgeException extends RuntimeException
{
	UnderAgeException()
	{
		super("You are under age");
	}
	UnderAgeException(String message)
	{
		super(message);
	}
}
class RuntimeExce
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		int age = sc.nextInt();
		try{
				if(age<18)
				{
				throw new UnderAgeException("You are not able to vote ");
				}
				else{
				System.out.println("You can vote now");
				}
		    }
	}
}
/*
Exception in thread "main" UnderAgeException: You are not able to vote
        at RuntimeExce.main(RuntimeExce.java:20)
*/