package arrays2D;

public class SumOfElements 
{
	public static void printSum(int[][] num)
	{
		int sum = 0;
		for(int i = 0; i <= num.length-1; i++)
		{
			for(int j = 0; j <= num[i].length-1; j++)
			{
				sum = sum + num[i][j];
			}
			System.out.println("Sum of row " + i +" is " + sum);
		}
		System.out.println(sum);
	}
	public static void main(String[] args) 
	{
		int[][] num = {{1,2,3},{4,5,6},{7,8,9}};
		printSum(num);
		
	}

}
