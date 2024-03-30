package Assignment;

/*print n even numbers
input:-n=10
output:-2 4 6 8 10 12 14 16 18 20.
*/
public class Answer15 
{
	public static void printEven(int n)
	{
		int i = 0;
		
		for(i = 1; i <= n; i++)
		{
				System.out.print(i*2+" ");
		}
	}
	public static void main(String[] args) 
	{
		printEven(10);
		
	}

}
