package arrays;

public class ReverseArrayWithoutUsingExtraVariable 
{
	public static int[] reverse(int[] num)
	{
		int j = num.length;
		for(int i = 0; i <= j/2; i++)
		{
			int temp = num[i];
			num[i] = num[j-i-1];
			num[j-i-1] = temp;
		}
		
		for(int i = 0; i <= num.length-1; i++)
		{
			System.out.print(num[i]+" ");
		}
		return num;
	}
	public static void main(String[] args) 
	{
		int[] num = {5,4,3,2,1};
		reverse(num);
		
	}

}
