package logicalprog;

import java.util.Scanner;

public class TableOf13 
{
	public static void tab(int n)
	{
		int i = 0;
		int x = 2;
		
		for(i=1; i<=n; i++)
		{
			System.out.println(x);
			x = x+(i*13);
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer number - ");
		int a = sc.nextInt();
		
		tab(a);
		
	}

}
