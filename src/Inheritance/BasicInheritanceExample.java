package Inheritance;

public class BasicInheritanceExample 
{
	public static void main(String[] args) 
	{
		Person p1 = new Person("John Doe");
		
		Student s1 = new Student("Alice Smith", 123);
		
		p1.displayInfo();
		s1.displayInfo();
		s1.diplayStudentInfo();
		
	}

}
