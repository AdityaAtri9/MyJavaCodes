package arrays;

import java.util.Scanner;

public class TakingInputInArray 
{
	public static void main(String[] args) 
	{
		int i = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int n = sc.nextInt();
		int[] num = new int[n];
		System.out.println("Enter in elements");
		{
			for(i = 0; i <= num.length-1; i++)
			{
				num[i] = sc.nextInt();
				System.out.println(num[i]);

			}


		}
		
		
	}

}
