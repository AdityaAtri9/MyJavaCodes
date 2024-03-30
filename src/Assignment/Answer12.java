package Assignment;

//A Smith number is a composite number whose sum of digits equals to the sum of digits of its prime factors, excluding 1

public class Answer12 
{
	//To check if the given number is prime or not.
	
	public static boolean checkPrime(int n)
	{
		int i = 0;
		int c = 0;
		
		for(i = 2; i < Math.sqrt(n); i++)
		{
			if(n%i==0)
			{
				c++;
			}
		}
		if(c==0)
		{
			return true;
		}
		return false;
	}
	
	
	//To extract the prime factors of the number.
	public static int primeFactors(int a)
	{
		int i = 0;
		int sum = 0;
		
		for(i = 2; i < a; i++)
		{
			if(a%i==0 && checkPrime(i))
			{
				int temp = i;
				
				while(temp>0)
				{
					int rem = temp%10;
					sum = sum + rem;
					temp = temp/10;
				}
			}
		}
		return sum;
	}
	
	//To check if the given number is Smith or not.
	
	public static String checkSmith(int num)
	{
		if(num == 1)
		{
			return "Invalid";
		}
		int sum = 0;
		int sum1 = primeFactors(num);
		System.out.println(sum1);
		
		if(checkPrime(num) == false)
		{
			while(num>1)
			{
				int rem = num%10;
				sum = sum + rem;
				num = num/10;
			}
		}
		System.out.println(sum);
		
		if(sum == sum1)
		{
			return "The number is Smith number";
		}
		return "The number is not Smith number";
	}
	
	public static void main(String[] args) 
	{
		System.out.println(checkSmith(85));
		
	}

}
