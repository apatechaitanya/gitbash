class Parent
{
	int a = 10;
	int b = 20;
	
	void printData()
	{
		System.out.println(a);
		System.out.println(b);
	}
	void m1()
	{
		System.out.println("Parent :: m1()");
	}
}
class Child extends Parent
{
	int a = 30;
	void printParentData()
	{
		System.out.println(a);
		System.out.println(b);
	}
	void m1()
	{
		System.out.println("Child :: m1()");
	}
	void m2()
	{
		System.out.println("Child :: m2()");
	}
}
class SingleInheritance
{
	public static void main(String [] args)
	{
		Child c = new Child();
		c.printParentData();
		c.printData();
		c.m2();
		c.m1();
		System.out.println(c.a);
		
		Parent p = new Parent();
		System.out.println(p.a);
		
		Parent p1 = new Child(); //Upcasting
		System.out.println(p1.a);
		//p1.m2(); CTE
		p1.m1();
	}
}