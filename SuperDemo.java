class Parent
{
	void m1(int a,int b)
	{
		System.out.println("Parent : m1");
	}
}
class Child extends Parent
{
	@Override
	void m1(int c,int d)
	{
		super.m1(c,d);   //to call parent class methods.
		System.out.println("Child : m1");
	}
}
class SuperDemo
{
	public static void main(String [] args)
	{
		Parent p1 = new Parent();
		Parent p2 = new Child();
		Child c = new Child();
		
		//p1.m1(10,20);
		p2.m1(10,30);
		//c.m1(10,10);
	}
}