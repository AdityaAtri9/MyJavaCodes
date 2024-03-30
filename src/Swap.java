
import java.util.Scanner;
public class Swap {

	public static void main(String[] args) 
	{
		int temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		 temp = a;
		 a = b;
		 b = temp;
		
		System.out.println("Swapped number is: \n" + a + b);
		

	}

}
