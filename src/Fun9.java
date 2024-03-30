
public class Fun9 
{
	static int total(int p ,int c, int m, int o) 
	{
		return p + c + m + o;
	}
	static void percentage(int a, int b, int c, int d) 
	{
		float sum = total(a, b, c, d);
		float perc = sum/400.0f * 100; 
		System.out.println(perc);
	}
	public static void main(String[] args) 
	{
		percentage(89,76,78,90);
		
	}

}
