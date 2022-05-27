class ArrayIndexOutOfBoundsExceptionDemo
{
	public static void main(String [] args)
	{
		try {
			int arr[] = {1,2,3,4,5};
			arr[10] = 10;
			
			String str = "abcd";
			char c = str.charAt(6);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("1");
			throw e;
		}catch(StringIndexOutOfBoundsException e1)
		{
			System.out.println("2");
		}finally{
			System.out.println("4");
		}
	}
}