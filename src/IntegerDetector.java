import java.util.Scanner;

public class IntegerDetector 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		if (sc.hasNextInt())
		{
			System.out.println("The number is integer ");
			
		} else {
			System.out.println("The number is not integer ");
		}
	
		sc.close();
	}

}
