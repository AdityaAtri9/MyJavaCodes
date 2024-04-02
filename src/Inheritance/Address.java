package Inheritance;

public class Address 
{
	int houseNo;
	String streetName;
	String areaName;
	String city;
	int pincode;
	String state;
	public Address(int houseNo, String streetName, String areaName, String city, int pincode, String state) {
		this.houseNo = houseNo;
		this.streetName = streetName;
		this.areaName = areaName;
		this.city = city;
		this.pincode = pincode;
		this.state = state;
	}
	
	void display()
	{
		System.out.println(houseNo+" "+streetName+" "+areaName+" "+city+" "+pincode+" "+state);
	}
	

}
class Customer
{
	String name;
	int age;
	String email;
	long phNo;
	Address a;
	
	public Customer(String name, int age, String email, long phNo,int houseNo, String streetName, String areaName, String city, int pincode, String state) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.phNo = phNo;
		this.a = new Address(houseNo,streetName,areaName,city,pincode,state);
	}

	void info()
	{
		System.out.println(name+" "+age+" "+phNo+" "+email);
		a.display();
	}
	
	
}
