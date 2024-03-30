package Inheritance;

public class Student1 
{
	String name, qualification;
	double percentage;
	int yop;
	
	public Student1(String name, String qualification, double percentage, int yop)
	{
		this.name = name;
		this.qualification = qualification;
		this.percentage = percentage;
		this.yop = yop;
	}
	
	@Override
	public String toString()
	{
		return this.name+" "+this.qualification+" "+ this.percentage+" "+this.yop;
	}
}
