package subArrays;

//Java program to split an array 
//into two equal sum subarrays

public class arraySplitPoint 
{
	public static int findSplitPoint(int[] nums)
	{
		int leftSum = 0;
		
		for(int i = 0; i <= nums.length-1; i++)
		{
			leftSum = leftSum + nums[i];
			
			int rightSum = 0;
			for(int j = i + 1; j <= nums.length-1; j++)
			{
				rightSum = rightSum + nums[j];
			}
			
			if(leftSum == rightSum)
			{
				return i + 1;
			}
		}
		return -1;
		
	}
	
	public static void printTwoParts(int[] nums)
	{
		int splitPoint = findSplitPoint(nums);
		
		if(splitPoint == -1 || splitPoint == nums.length)
		{
			System.out.println("Not possible");
		}
		
		
		for(int i = 0; i <= nums.length-1; i++)
		{
			if(splitPoint == i)
			{
				System.out.println();
			}
			System.out.print(nums[i] + " ");	
		}
	}
	
	
	public static void main(String[] args) 
	{
		int[] nums = {1,2,3,4,5,5};
		printTwoParts(nums);

		
	}

}
