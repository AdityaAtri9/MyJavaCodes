package arrays;

import java.util.Scanner;

public class StarPattern3 
{
	public static void print(int r)
	{
//		for(int i = 1; i <= r; i++)
//		for(int i = r; i >= 1; i--)//--> for reverse
		for(int i = 1; i <= r; i++)
		{
//			for(int j = 1; j <= i; j++)
//			for(int j = 1; j <= i; j++)//--> for reverse
			for(int j = 1; j < i; j++)
			{
				System.out.print("  ");
			}
			for(int j = 1; j <= i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row");
		int row = sc.nextInt();
		
		print(row);
		
	}

}
