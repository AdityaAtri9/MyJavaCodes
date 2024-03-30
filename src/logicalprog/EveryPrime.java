package logicalprog;

public class EveryPrime 
{
	public static void dis(int start, int n)
	{
		int p = 0;
		//for(int i = end;; i--)          --> for last to first
//		{
//			static void dis(int start, int n)
//			{
//				int p = 0;
			 for(int i = start;; i++)
			 {
				 if(helper(i))
				 {
					 System.out.println(i);
					 p++;
				 }
				 if(p==n)
				 {
					 break;
				 }
			 }
		}
	static boolean helper(int x)
	{
		int c = 0;
		for(int i = 2; i < x; i++)
		{
			if(x%i==0)
			{
				c++;
			}
		}
		if(c==0)
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) 
	{
		dis(10,3);
	}
	
}


