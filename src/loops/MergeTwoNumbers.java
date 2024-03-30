package loops;

import java.util.Scanner;

public class MergeTwoNumbers //time complexity = O(n)
{
	//Logic 1
	public static long merge1(int n1, int n2)
	{
		int c = 0;
		int t = n2;
		
		//counting no. of digits
		while(t>0)
		{
			c++;
			t=t/10;
		}
		//calculating power
		int res = 1;
		for(int i = 1; i <= c; i++)
		{
			res = res * 10;
		}
		//merging numbers
		return n1*res+n2;
	}
	//Logic 2
	public static long merge2(int n1, int n2)// Time complexity = O(log(n))
	{
		int t = n2;
		int res = 1;
		
		//counting no. of digits and power in the same loop
		while(t>0)
		{
			res = res*10;
			t=t/10;
		}
		return n1*res+n2;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("Enter two numbers - ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		System.out.println(merge1(n1, n2));
		System.out.println(merge2(n1, n2));
		}
	}

}
