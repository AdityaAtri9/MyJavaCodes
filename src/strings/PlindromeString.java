package strings;

public class PlindromeString 
{
	public static boolean pal(String str)
	{
		String rev = "";
		for(int i = 0; i <= str.length()-1;i++)
		{
			rev = str.charAt(i) + rev;
		}
		if(str.equals(rev)) 
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) 
	{
		System.out.println(pal("MADAM"));
		
	}

}
