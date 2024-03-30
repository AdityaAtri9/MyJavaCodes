package logicalprog;
import java.util.Scanner;

public class NegativeSeries 
{
	public static void nigga(int n)
	{
		int x = -1;
		int y = 4;
		int i = 0;
		
		for(i=1; i<=n; i++)
		{
			if(i%2==0)
			{
				System.out.print(y+" ");
				y = y+6;
			}
			else
			{
				System.out.print(x+" ");
				x = x - 6;
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer number - ");
		int a = sc.nextInt();
		
		nigga(10);
		
	}

}
