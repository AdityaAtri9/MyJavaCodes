
public class Bonus 
{
	public static float check( int sal, int exp)
	{
		float bon = sal*0.05f;
		
		if(exp > 5) 
		{
			return sal + bon;
		}
		else 
		{
			return sal;
		}
	}
	public static void main(String[] args) 
	{
		System.out.println(check(600000, 8));
		
	}

}
