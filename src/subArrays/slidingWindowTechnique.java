package subArrays;


//Maximum Sum of a Subarray with K Elements
public class slidingWindowTechnique 
{
	public static int maxSubarraySum(int[] nums, int k)
	{
		if(k > nums.length || k == 0)
		{
			return 0;
		}
		
		int windowSum = 0;
		
		for(int i = 0; i < k; i++)
		{
			windowSum = windowSum + nums[i];
		}
		
		int maxSum = windowSum;
		
		for(int i = k; i <= nums.length-1; i++)
		{
			windowSum = windowSum + nums[i] - nums[i - k]; // from previous window sum subtract the first element and add the next element.
			maxSum = Math.max(maxSum, windowSum);
		}
		return maxSum;
	}
	
	public static void main(String[] args) 
	{
		int[] nums = {1,2,3,4,5,6,7,8};
		int k = 2;
		System.out.println(maxSubarraySum(nums, k));
		
	}

}
