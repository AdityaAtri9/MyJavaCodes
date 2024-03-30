package logicalprog;

public class OneFiveTen 
{
	public static void display(int n)
	{
		int i = 0;
		int x = 1;
		int y = 4;
		
		for(i = 1; i <= n; i++)
		{
			System.out.print(x+" ");
			x = x + y;
			y++;
		}
	}
	public static void main(String[] args) 
	{
		display(10);
		
	}

}
