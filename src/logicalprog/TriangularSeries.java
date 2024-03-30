package logicalprog;
//1 3 6 10 15 21......

import java.util.Scanner;

public class TriangularSeries 
{
	public static void tri(int n) 
	{
		int i = 0;
		int x = 0;
		
		for(i=1; i<=n; i++)
		{
			System.out.print(i + " ");
			x++;
			i=i+x;
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer number - ");
		int a = sc.nextInt();
		tri(a);
		
	}

}
