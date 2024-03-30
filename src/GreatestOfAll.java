import java.util.Scanner;

public class GreatestOfAll {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number :");
		int a = sc.nextInt();
		
		System.out.println("Enter the second number :");
		int b = sc.nextInt();
		
		System.out.println("Enter the third number :");
		int c = sc.nextInt();
		
		System.out.println("The greatest number is :");
		
		if(a>b)
			if(a>c)
				System.out.println(a);
		
		if(b>a)
			if(b>c)
				System.out.println(b);
		
		if(c>a)
			if(c>b)
				System.out.println(c);
		
	}

}
