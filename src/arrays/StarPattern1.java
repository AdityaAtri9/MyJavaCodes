package arrays;


import java.util.Scanner;

public class StarPattern1 
{
	public static void print(int r, int c)
	{
		int x = 9;
		
		for(int i = 0; i <= r; i++)
		{
			for(int j = 0; j <= c; j++)
			{
				System.out.print("* ");//--> this prints star
//				System.out.print(i+" ");
//				System.out.print(j+" ");
//				System.out.print(x+" ");
				x++;
			}
			System.out.println();
		}
	}
	
	public static void print2(int r, int c)
	{
		int x = 1;
		for(int i = 1; i <= r; i++)
		{
			for(int j = 0; j <= i; j++)
			{
				System.out.println(x+" ");
			}
			x++;
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter row");
			int row = sc.nextInt();
			
			System.out.println("Enter column");
			int c = sc.nextInt();
			print(row,c);
		}
		
	}

}
