package Assignment;

/* Peterson number
 * e.g. :- 145 = !1 + !4 + !5
 * 			 = 1+4*3*2*1+5*4*3*2*1
 * 			 = 1+24+120
 * 		 145 = 145
 */
public class Answer9 
{
	public static void check(int n)
	{
		int sum = 0;
		int x = n;
		
		while(n>0)
		{
			int fac = 1;

			int rem = n%10;
			
			//for loop to calculate sum of Factorial.
			for(int i = 1; i <= rem; i++)
			{
				fac = fac*i;
			}
			sum = sum + fac;
			
			n = n/10;
		}
		
		if(sum == x)
		{
			System.out.println("The number is peterson");
		}
		else
		{
			System.out.println("The number is not peterson");
		}
	}
//	public static void isPeterson(int num)
//	{
//		if(check(num)==num)
//		{
//			System.out.println("The number is peterson");
//		}
//		else
//		{
//			System.out.println("The number is not peterson");
//		}
//	}
	public static void main(String[] args) {
		check(145);
	}

}
