package arrays;

import java.util.Scanner;

//for printing numbers in pattern

public class NumPattern1 
{
	public static void print(int r, int c)
	{
		for(int i = 1; i <= r; i++)
		{
			for(int j = c; j >= 1; j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row");
		int row = sc.nextInt();
		
		System.out.println("Enter column");
		int c = sc.nextInt();
		
		print(row, c);
	}

}
