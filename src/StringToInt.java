
public class StringToInt 
{
	public static long pareseInt(String str)
	{
		long res = 0l;
		int j = 0;
		if(str.charAt(0) == '-')
		{
			j = 1;
		}
		for(int i = j; i <= str.length()-1;i++)
		{
			res = res*10+(str.charAt(i)-48);
		}
		if(j == 1)
		{
			return -1*res;
		}
		return res;
	}
	
	public static void main(String[] args) 
	{
		System.out.println(pareseInt("-123"));
		
	}

}
