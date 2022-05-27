import java.io.*;
class UnderAgeException extends Exception
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
class Voting
{
	public static void main(String[] args) throws UnderAgeException
	{
		int age = 17;
		if(age<18)
		{
			throw new UnderAgeException();
		}
	}
}
/*
Exception in thread "main" UnderAgeException: You are under age
        at Voting.main(Voting.java:20)
*/