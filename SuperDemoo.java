class Parent
{
	{
		System.out.println("INIT :PArent");
	}
	Parent()
	{
		System.out.println("COunstructor :PArent");
	}
}
class Child extends Parent
{
	{
		System.out.println("Init:CHILD");
	}
	Child()
	{
		System.out.println("Counstructor:CHild");
	}
	Child(int a,int b)
	{
		System.out.println("COunstructor :CHild");
	}
}
class SuperDemoo
{
	public static void main(String [] args)
	{
		Parent c = new Child();
		Parent d = new Child(10,20);
		
	}
}
