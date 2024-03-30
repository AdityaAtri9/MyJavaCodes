import java.util.Scanner;

public class Circle 
{
public static void main(String[] args) 
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the radius");
	
	float r = sc.nextFloat();
	double area = (3.14)*r*r;
	
	System.out.println("The area of the circle with radius" + r +" is " +area);
}
}
