package strings;

public class SearchKeyString 
{
	public static boolean search(String str, String key)
	{
		if(key.length() < str.length() && str.substring(0,key.length()).equals(key))
		{
			return true;
		}
		return false;
	}
	
	public static boolean endsWith(String str, String key)
	{
		if(key.length() < str.length() && str.substring(str.length()-key.length()).equals(key))
		{
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) 
	{
		String str = "aadjkabf fbjdlbf ndljfn";
//		System.out.println(search(str, "aad"));
		System.out.println(endsWith(str,"jfn"));
//		System.out.println(str.endsWith("jfn"));
		
	}

}
