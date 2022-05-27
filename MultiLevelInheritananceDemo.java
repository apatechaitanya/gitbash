class A
{
	int p;
}
class B extends A
{
	int p;
	int q;
}
class C extends B
{
	int p;
	int q;
	int r;
}
class MultiLevelInheritananceDemo{
	public static void main(String [] args)
	{
		A a1 = new A();
		A a2 = new B();
		A a2 = new C();
		
		B b1 = new B();
		B c1 = new C();
		
		C c = new C();
		
		
		System.out.println(a1.p);
		System.out.println(a1.q);
		System.out.println(a1.r);
		
	}
}