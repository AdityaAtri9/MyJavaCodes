package Assignment;

public class Answer5 
{
	public static void reverse(int n)
	{
		int i = 0;
		
		while(n>0)
		{
			int rem = n%10;
			System.out.print(rem);
			n = n/10;
		}
	}
	public static void main(String[] args) 
	{
		reverse(123456789);
		
	}

}
