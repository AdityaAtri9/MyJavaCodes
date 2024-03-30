import java.util.Scanner;

public class Triangle 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the base of the triangle");
		float b = sc.nextFloat();
		
		System.out.println("Enter the height of the triangle");
		float h = sc.nextFloat();
		
		float area = (0.5f)*b*h;
		System.out.println("The are of the triangle  with base " + b +" and height " + h + " is " + area );

		

	}

}
