package logicalprog;

public class EvenFibo 
{
	public static void fibo(int n)
	{
		int i = 0;
		int x = 1;
		int y = 1;
		int c = 0;
		
		for(i=1;;i++)
		{
			if(x%2==0)
			{
				c++;
				System.out.print(x+" ");
				if(c==n)
				{
					break;
				}
			}
			int sum = x + y;
			x = y;
			y = sum;
			
		}
		
	}
	public static void main(String[] args) 
	{
		fibo(3);
		
	}

}
