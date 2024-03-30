package arrays;

import java.util.Scanner;

public class NumPattern2 
{
	public static void print(int r, int c)
	{
		for(int i = r; i >= 1; i--)
		{
			for(int j = c; j >= 1; j--)
			{
				System.out.print(i+" ");
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
