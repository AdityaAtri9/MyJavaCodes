package arrays;

import java.util.Arrays;

public class PrintDuplicate 
{
	public static void print(int[] num, int n)
	{
		boolean b = false;
		int hash[] = new int[n];
		
		for(int i = 0; i <= n-1; i++)
		{
			hash[num[i]]++;
		}
		System.out.println(Arrays.toString(hash));
		
		for(int i = 0; i <= hash.length-1; i++)
		{
			//if(hash[i]>=1) --> remove duplicates AND print frequency
			//if(hash[i]==1) --> print unique
			if(hash[i] > 1) // --> print duplicates
			{
				b = true;
				System.out.print(i+" ");
				//System.out.println(i + " ----> "+ hash[i]); ---> for frequency
			}
		}
		if(b == false)
		{
			System.out.println(-1);
		}
	}
	public static void main(String[] args) 
	{
		int[] num = {1,2,3,1,1,2,5,3,7,9,1};
//		int[] num = {0,1,2,3,4,5};

		print(num, num.length);
		
	}

}
