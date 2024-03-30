package Assignment;

public class Answer8 
{
	public static void count(int n)
	{
		int c = 0;
		
		while(n>0)
		{
			c++;
			int rem = n%10;
			n = n/10;
		}
		System.out.println("Total digits - " + c);
	}
	public static void main(String[] args) 
	{
		count(235325);
		
	}

}
