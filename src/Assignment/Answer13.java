package Assignment;

//wajp to count even and odd digits in a given number excluding zero.

public class Answer13 
{
	public static void count(int n)
	{
		if(n == 0)
		{
			System.out.println("Invalid");
		}
		
		int c = 0;
		int p = 0;
		
		while(n>0)
		{
			int rem = n%10;
			
			if(rem == 0)
			{
				
			}
			else if(rem%2==0)
			{
				c++;
			}
			else
			{
				p++;
			}
			n = n/10;
		}
		
		System.out.println("Even digits - " + c);
		System.out.println("Odd digits - " + p);
	}
	public static void main(String[] args) 
	{
		count(222111000);
		
	}

}
