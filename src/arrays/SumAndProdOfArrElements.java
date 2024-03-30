package arrays;

public class SumAndProdOfArrElements 
{
	public static void sumAndProd(int n[])
	{
		int i = 0;
		int sum = 0;
		int prod = 1;
		for(i = 0; i <= n.length-1; i++)
		{
			sum = sum+n[i];
			prod = prod*n[i];
		}
		System.out.print("The sum of the elements of array is - " + sum +"\n");
		System.out.print("The prod of the elements of array is - " + prod);
	}
	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4,5};
		sumAndProd(a);
		
	}
}
