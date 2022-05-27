class UncheackedException extends Exception
{
	static void m3(){
		System.out.println("m3 before");
		int i = 1/0;
		System.out.println("m3 before");
	}
	static void m2(){
		System.out.println("m2 After");
		m3();
		System.out.println("m2 After");
	}
	static void m1(){
		System.out.println("m1 before");
		m2();
		System.out.println("m1 After");
	}
	static void m(){
		System.out.println("m before");
		m1();
		System.out.println("m after");
	}
	public static void main(String [] args) 
	{
		System.out.println("main");
		UncheackedException.m();
	}
}