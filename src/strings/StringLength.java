package strings;

//Length of String without length()
public class StringLength 
{
	public static void length(String str)
	{
		int c = 0;
		for(int i = 0;; i++)
		{
			try 
			{
				str.charAt(i);
				c++;
			}
			catch(Exception e)
			{
				break;
			}
		}
		System.out.println(c);
	}
	public static void main(String[] args) 
	{
		String str = "Aditya";
		length(str);
		
	}

}
