import java.util.Scanner;

public class Student 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the marks for Physics");
		int p = sc.nextInt();
		
		System.out.println("Enter the marks for Chemistry");
		int c = sc.nextInt();
		
		System.out.println("Enter the marks for Maths");
		int m = sc.nextInt();
		
		System.out.println("Enter the marks for Optional");
		int o = sc.nextInt();
		
		int total = p + c + m + o;
		
		double perc = (total/400.0)*100;
		
		System.out.println("The total percentage will be :" + perc);
		

		
		

	}

}
