
public class EvenOrOddCase 
{
	public static void check(int a)
	{
		switch(a%2)
		{
		case 0:System.out.println("The number is even");
		break;
		case 1 :System.out.println("The number is odd");
		}
	}
	public static void main(String[] args) 
	{
		check(9432);
		
	}
	

}
