/* import java.util.Scanner;

public class GreaterOrNot {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int g = 20;
		
		System.out.println("enter a number:");
		int x = sc.nextInt();
		
		if (x > g) 
		{
			System.out.println("Your number is greater");
		}
		else 
		{
			System.out.println("Your number is smaller");
		}
	}

}   */


//-------------------------OR----------------------------//

import java.util.Scanner;

class GreaterOrNot{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a value :");
		int a = s.nextInt();
		
		System.out.println(a>20);
		
	}
}