
//This is the my way to do it

/* public class Fun8 
{
	static String firstName(String fn) 
	{
		return "$" + fn;
	}
	static String lastName(String ln) 
	{
		return " " + ln + "$";
	}
	static void fullName(String name) 
	{
		System.out.println(name);
	}
	public static void main(String[] args) 
	{
		String x1 = firstName("Rahul");
		String x2 = x1 + lastName("Dravid");
		fullName(x2);
		
	}

}  */

//This is the sir's question
public class Fun8 
{
	static String firstName(String fn) 
	{
		return "$" + fn;
	}
	static String lastName(String ln) 
	{
		return ln + "$";
	}
	static void fullName(String x, String y) 
	{
		String fullName = x + " " + y;
		System.out.println(fullName);
	}
	public static void main(String[] args) 
	{
		String x1 = firstName("Rahul");
		String x2 = lastName("Dravid");
		fullName(x1, x2);
		
		
	}

}













