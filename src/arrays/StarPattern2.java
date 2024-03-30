package arrays;

import java.util.Scanner;

public class StarPattern2 
{
	public static void pattern(int r, int c)
	{
		for(int i = 1; i <= r; i++)
		{
			for(int j = 1; j <= c; j++)
			{
//				if(j == 1 || i == r) --> L
//				if(j == 1 || i == r) --> L
//				if(i == 1 || j == 1 || i == r || j == c) -->box
//				if(i == j)--> diagonal
//				if(i+j == r+1) --> diagonal
				if(i == j || i+j == r+1)// --> X
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
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
		
		pattern(row, c);
		
	}

}
