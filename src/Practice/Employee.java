package Practice;

public class Employee 
{
	String name;
	int salary;
	
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return this.name+" "+this.salary;
	}
}
class Bike
{
	String model;
	int price;
	
	public Bike(String model, int price) {
		this.model = model;
		this.price = price;
	}

	@Override
	public String toString() {
		return this.model+" "+this.price;
	}
}












