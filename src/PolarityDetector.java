import java.util.Scanner;

public class PolarityDetector {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number :");
		int x = sc.nextInt();
		
		if ( x > 0 ) 
		{
			
			System.out.println("The numer is positive.");
		}
		else 
		{
			System.out.println("The number is negative.");
		}
		
		
	}

}
