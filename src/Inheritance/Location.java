package Inheritance;

public class Location 
{
	String pickUpPoint;
	String dropPoint;
	
	public Location(String pickUpPoint, String dropPoint) {
		this.pickUpPoint = pickUpPoint;
		this.dropPoint = dropPoint;
	}
	
	void details()
	{
		System.out.println("Pick up point - "+this.pickUpPoint);
		System.out.println("Drop point - "+this.dropPoint);
	}
}
class Cab
{
	String driverName;
	String model;
	String color;
	String NumPlate;
	Location loc;
	
	public Cab(String driverName,String model, String color, String numPlate, String pickUpPoint, String dropPoint) {
		
		this.driverName = driverName;
		this.model = model;
		this.color = color;
		this.NumPlate = numPlate;
		this.loc = new Location(pickUpPoint, dropPoint);
	}
	void info()
	{
		System.out.println(driverName +" "+model+" "+color+" "+NumPlate);
		loc.details();
	}
	
	
}

