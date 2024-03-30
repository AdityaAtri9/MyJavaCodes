package logicalprog;

import java.util.Scanner;

public class FibonacciSeries 
{
	public static void fibo(int n)
	{
		int i = 0;
		int x = 0;
		int y = 1;
		
		for(i=1; i<=n; i++)
		{
			System.out.println(x);
			int sum = x + y;
			x = y;
			y = sum;
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer number - ");
		int a = sc.nextInt();
		
		fibo(a);
	}

}
