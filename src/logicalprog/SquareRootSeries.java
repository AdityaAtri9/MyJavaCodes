package logicalprog;

import java.util.Scanner;

public class SquareRootSeries 
{
	public static void sq(int n)
	{
		int i = 0;
		
		for(i = 1; i <= n; i++)
		{
			System.out.println(i*i);
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a integer number - ");
		int a = sc.nextInt();
		
		sq(a);
		
	}

}
