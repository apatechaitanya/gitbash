class A{
	void m1()
	{
		System.out.println("In A class m1");			
	}
	public void m2(int x,double y)
	{
		System.out.println("In A class m2");			
	}
	public void m3(int a,double b,float s)
	{
		System.out.println("In A class m3");	
	}
	
}
class B extends A{
	void m1(){
		System.out.println("In B class m1");
	}	
	public void m2(int a,double b)
	{
		System.out.println("In B class m2");
	}
	@Override
	public void m3(int a,double b,float s)
	{
		System.out.println("In B class m3");
	}
}
class Overriding
{
	public static void main(String [] args)
	{
		A a = new B();
		a.m1();
		a.m3(0,0,0);
	}
}