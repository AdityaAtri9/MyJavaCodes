package Assignment;
import java.util.Scanner;

public class Answer7 
{
	public static boolean leap(int n)
	{
		if(n%4==0)
		{
			return true;
		}
		return false;
	}
	public static void checkLeap(int s, int e)
	{
		for(int i = s; i <= e; i++)
		{
			if(leap(i))
			{
				System.out.print(i+" ");
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the starting of range - ");
		int s = sc.nextInt();
		
		System.out.println("Enter the ending of range - ");
		int e = sc.nextInt();
		
		sc.close();
		checkLeap(s, e);
		
		
	}

}
