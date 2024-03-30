package logicalprog;
import java.util.Scanner;

public class EvenSeries 
{
	public static void printEven(int n)
	{
		int i = 0;
		int x = 0;
		
		System.out.println("Number of even number under "+n+" - ");
		for(i=1; i<=n; i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
				x++;
			}
		}
		System.out.println("Total even numbers are - "+x);
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an interger number : ");
		int a = sc.nextInt();
		sc.close();
		
		printEven(a);
	}

}
