package Inheritance;

public class Person 
{
	String name;
	
	Person(String name)
	{
		this.name = name;
	}
	
	void displayInfo()
	{
		System.out.print("Name - " + name + " ");
	}
}

class Student extends Person
{
	static int studentId;
	
	Student(String name, int studentId)
	{
		super(name);
		this.studentId = studentId;
	}
	
	static void diplayStudentInfo()
	{
		System.out.print("Student Id - " + studentId + " ");
	}
}
