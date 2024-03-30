package arrays;

import java.util.Scanner;

public class OddLeft {
	public static void odd(int[] n)
	{
		int res[] = new int[n.length];
		
		int j = 0;
//		int z = n.length-1;
		
		for(int i = 0; i <= n.length-1; i++)
		{
			if(n[i]%2 != 0)
			{
				res[j] = n[i];
				j++;
			}
//			else
//			{
//				res[z] = n[i];
//				z--;
//			}
		}
		for(int i = 0; i <= n.length-1; i++)
		{
			if(n[i]%2 == 0)
			{
				res[j] = n[i];
				j++;
			}
		}
		printArray(res);
	}
	
	public static void printArray(int[] n)
	{
		for(int i = 0; i <= n.length-1; i++)
		{
			System.out.print(n[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size");
		int s = sc.nextInt();
		int num[] = new int[s];
		
		System.out.println("Enter the int elements");
		for(int i = 0; i <= num.length-1; i++)
		{
			num[i] = sc.nextInt();
		}
		odd(num);
	}

}
