//Bean Class 
// POJO class
//Model class
class Employee
{
	//Now data is secure
	private String name;
	private int age;
	private double salary;
	private char Gender;
	
	public Employee (String name,int age,double salary,char Gender)
	{
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.Gender = Gender;
	}
	//read -->get
	//write-->set
	public String getName()
	{
		return this.name;
	}
	public int getAge()
	{
		return this.age;
	}
	public double getSalary()
	{
		return this.salary;
	}
	public char getGender()
	{
		return this.Gender;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	public void setGender(char Gender)
	{
		this.Gender = Gender;
	}
}
class Encapsulation
{
	public static void main(String [] args)
	{
		Employee e1 = new Employee("A",22,60000,'M');
		
		System.out.println(e1.getName());
		System.out.println(e1.getAge());
		System.out.println(e1.getSalary());
		System.out.println(e1.getGender());
		
		System.out.println("Modified Data ");
		e1.setName("Chaitanya");
		e1.setAge(22);
		e1.setSalary(60000);
		e1.setGender('F');
		
		System.out.println(e1.getName());
		System.out.println(e1.getAge());
		System.out.println(e1.getSalary());
		System.out.println(e1.getGender());
		
		
	}
}