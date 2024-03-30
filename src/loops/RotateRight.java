package loops;

import java.util.Scanner;

public class RotateRight 
{
	public static int rotate(int n)
	{
		int first = n/10;
		int last = n%10;
		int t = first;
		int res = 1;
		
		int c = 0;
		while(t>0)
		{
			c++;
			res = res * 10;
			t = t/10;
		}
		System.out.println("number of rotations - " + c);
		n = last*res+first;
		return n;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter a number - ");
			int n = sc.nextInt();
			System.out.println(rotate(n));
		}
	}

}
