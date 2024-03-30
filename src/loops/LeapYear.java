package loops;

public class LeapYear 
{
	public static boolean leap(int n)
	{
		if(n%4==0)
		{
			return true;
		}
		return false;
	}
	public static void checkLeap(int s, int e)
	{
		for(int i = s; i <= e; i++)
		{
			if(leap(i))
			{
				System.out.print(i + " ");
			}
		}
	}
	public static void main(String[] args) 
	{
		checkLeap(2000, 2100);
		
	}

}
