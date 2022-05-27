class ArithmeticException
{
	public static void main(String... args)
	{
		System.out.println("Before");
						

		try{
		int a = 1/0;
		System.out.println("sdvsd");
		}
		catch(RuntimeException c){
			c.printStackTrace();
			System.out.println("Zero se kon divide krta hee");
		}
		catch(Throwable t)
		{
			
		}
		System.out.println("After");
	}
}