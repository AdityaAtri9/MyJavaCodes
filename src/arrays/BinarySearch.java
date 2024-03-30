package arrays;

import java.util.Scanner;

public class BinarySearch 
{
	public static int search(int[] num, int key)
	{
		int l = 0;
		int h = num.length-1;
		
		while(l <= h)
		{
			int mid = (l+h)/2;
			//if if mid is equal to key
			if(num[mid] == key)
			{
				return mid;
			}
			//if mid is greater than key
			else if(num[mid] > key)
			{
				h = mid - 1;
			}
			//if mid is less than key
			else
			{
				l = mid + 1;
			}
		}
		return -1;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size - ");
		
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter the array - ");
		
		for(int i = 0; i <= arr.length-1; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the key element - ");
		int k = sc.nextInt();
		sc.close();
		
		System.out.println(search(arr, k));
		
	}

}
