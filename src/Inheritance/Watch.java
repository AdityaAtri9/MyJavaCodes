package Inheritance;

public class Watch 
{
	String name;
	int price;
	
	Watch(String name,int price)
	{
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString()
	{
		return this.name+" "+this.price;
	}
}
class Bike
{
	String model;
	int price;
	public Bike(String model, int price) {
		super();
		this.model = model;
		this.price = price;
	}
	@Override
	public String toString() {
		return this.model+" "+this.price;
	}
}
class Student2
{
	String name, qual;
	float perc;
	public Student2(String name, String qual, float perc) {
		super();
		this.name = name;
		this.qual = qual;
		this.perc = perc;
	}
	@Override
	public String toString() {
		return this.name+" "+this.qual+" "+this.perc;
	}
}
class Pen
{
	String brand,color;
	int price;
	public Pen(String brand, String color, int price) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	@Override
	public String toString() {
		return this.brand+" "+this.color+" "+this.price;
	}
}
























