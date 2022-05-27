import java.io.*;
class ThrowDemo{
	public static void main(String [] args)
	{
		int i = 1/0;
		System.out.println("Before");
		try{
			throw new NullPointerException();
			throw new StackOverflowError(); //Unreachable 
		}catch(NullPointerException e){
			System.out.println("1");
		}catch(ArithmeticException e){
			System.out.println("2");
		}catch(Exception e){
			System.out.println("3");
		}catch(Throwable e){
			System.out.println("4");
		}finally{
			System.out.println("Finally");
		}
		System.out.println("After");
	}
}