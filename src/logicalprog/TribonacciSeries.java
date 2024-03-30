package logicalprog;

import java.util.Scanner;

public class TribonacciSeries 
{
	public static void tribo(int n)
	{
		int i = 0;
		int x = 0;
		int y = 1;
		int z = 1;
		
		for(i=1; i<=n; i++)
		{
			System.out.println(x);
			int sum = x + y + z;
			x = y;
			y = z;
			z = sum;
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer number - ");
		int a = sc.nextInt();
		sc.close();
		
		tribo(a);
	}

}
