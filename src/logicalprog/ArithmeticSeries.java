package logicalprog;

import java.util.Scanner;

public class ArithmeticSeries 
{
	public static void ap(int n)
	{
		int i = 0;
		
		for(i=1; i<=n; i=i+3)
		{
			System.out.println(i);
			//i = i+2;
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer number - ");
		int a = sc.nextInt();
		
		ap(a);
		
	}

}
