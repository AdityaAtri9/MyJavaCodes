package strings;

public class StringConvert 
{
	public static String convert(String str)
	{
		String res = "";
		for(int i = 0; i <= str.length()-1; i++)
		{
			char ch = str.charAt(i);
			if(ch >= 65 && ch <= 90)//upper to lower
			{
				res = res + (char)(ch + 32);
			}
			else if(ch >= 97 && ch <= 122)//lower to upper
			{
				res = res + (char)(ch - 32);
			}
			else//numeric and special
			{
				res = res+'_';
			}
		}
		return res;
	}
	public static void main(String[] args) 
	{
		System.out.println(convert("abc@123"));
		
	}

}
