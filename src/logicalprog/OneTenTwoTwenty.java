package logicalprog;

public class OneTenTwoTwenty 
{
	public static void display(int n)
	{
		int i = 0;
		int x = 1;
		int y = 10;
		
		for(i = 1; i <= n; i++)
		{
			if(i%2==0)
			{
				System.out.println(y);
				y = y + y;
			}
			else
			{
				System.out.println(x);
				x = x + x;
			}
		}
	}
	public static void main(String[] args) 
	{
		display(10);
		
	}

}
