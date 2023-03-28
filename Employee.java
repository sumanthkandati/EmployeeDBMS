package edbms;

public class Employee 
{
	private String id;
	private String name;
	private int age;
	private double salary;

	static int count=101;
	public Employee(String name,int age,Double salary)
	{
		this.id="JSP"+count;
		this.name=name;
		this.age=age;
		this.salary=salary;
		count++;
	}
	public String getId()
	{
		return id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public double getSalary() 
	{
		return salary;
	}
	public void setSalary(int salary) 
	{
		this.salary = salary;
	}

	@Override
	public String toString()
	{
		return "Id:"+id+"  Age:"+age+"  Name:"+name+"  Salary:"+salary;
	}

}
