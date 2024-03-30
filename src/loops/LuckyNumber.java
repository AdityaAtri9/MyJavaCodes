package loops;

import java.util.Scanner;

public class LuckyNumber 
{
	public static int add(int n)
	{
		int sum = 0;
		
		while(n>0)
		{
			int rem = n%10;
			sum = sum + rem;
			n = n/10;
		}
		return sum;
	}
	public static boolean checkLucky(int num)
	{
//		int sum = add(num);
		int sum = num;
		while(sum>9)
		{
			sum=add(sum);
		}
		if(sum == 1)
		{
			return true;
		}
		return false;
	}
	public static void printLucky(int s, int e)
	{
		for(int i = s; i <= e; i++)
		{
			if(checkLucky(i))
			{
				System.out.print(i+" ");
			}
		}
	}
	public static void main(String[] args) 
	{
//		System.out.println(checkLucky(7741));
//		printLucky(100, 999);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the starting range - ");
		int s = sc.nextInt();
		
		System.out.println("Enter the ending range - ");
		int e = sc.nextInt();
		sc.close();
		printLucky(s, e);
	}

}
