
public class Fun7 
{
	static int total(int p, int c, int m, int o) 
	{
		return p + c + m + o;
	}
	static void percentage(int sum) 
	{
		float perc = sum/400.0f*100;
		System.out.println(perc);
	}
	public static void main(String[] args) 
	{
		int x = total(57,47,56,89);
		percentage(x);
		
	}

}
