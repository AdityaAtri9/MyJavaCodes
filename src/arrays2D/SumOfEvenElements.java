package arrays2D;

public class SumOfEvenElements 
{
	public static void printEven(int[][] num)
	{
		int sum = 0;
		int c = 0;
		for(int i = 0; i <= num.length-1; i++)
		{
			for(int j = 0; j <= num[i].length-1; j++)
			{
				if(num[i][j]%2==0)
				{
					c++;
					sum = sum + num[i][j];
				}
			}
		}
		System.out.println("count = "+c);
		System.out.println(sum);
	}
	public static void main(String[] args) 
	{
		int[][] num = {{1,2,3},{4,5,6},{7,8,9}};
		printEven(num);
		
	}

}
