package logicalprog;

import java.util.Scanner;

public class TenFiveSixty 
{
	public static void display(int n)
	{
		int i = 0;
		int x = 10;
		int y = 5;
		
		for(i = 1; i <= n; i++)
		{
			if(i%2==0)
			{
				System.out.println(y);
				y = y + 10;
			}
			else
			{
				System.out.println(x);
				x = x + 50;
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer number - ");
		int a = sc.nextInt();
		sc.close();
		
		display(a);
		
		
	}

}
