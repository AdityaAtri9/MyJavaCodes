package Assignment;

public class Answer11 
{
	public static String checkSpy(int n)
	{
		int i = 0;
		int sum = 0;
		int prod = 1;
		
		while(n>0)
		{
			int rem = n%10;
			sum = sum + rem;
			prod = prod * rem;
			n = n/10;
		}
		if(sum == prod)
		{
			return "The number is Spy number";
		}
		else
		{
			return "The number is not Spy number";
		}	
	}
	public static void main(String[] args) 
	{
		System.out.println(checkSpy(123));
	}

}
