/*
Given an array arr[] of size N and a number K, the task is to find the smallest number M such that the sum of the array becomes lesser than or equal to the number K when every element of that array is divided by the number M.

Note: Each result of the division is rounded to the nearest integer greater than or equal to that element. For example: 10/3 = 4 and 6/2 = 3

Input
The first line contains two integers N and K.
Next line contains N integers denoting the elements of arr[]

Constraints:
1 <= N <= 100000
1 <= arr[i] <= 100000
1 <= K <= 100000000

Output
Print a single integer the value of smallest number M
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static int binarySearch(int arr[], int size, int k, int max)
	{
		int low = 1;
		int high = max;

		while(low < high)
		{
			int mid = low + (high-low)/2;

			if(sum(arr, size, mid) > k)
			{
				low = mid + 1;
			}
			else
			{
				high = mid;
			}
		}
		return high;
	}

	public static int sum(int arr[], int size, int M)
	{
		int sum = 0;
		for(int i=0; i<size; i++)
		{
			sum += ((arr[i]-1)/M + 1);
		}
		return sum;
	}

	public static void main (String[] args) {
    // Your code here
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int k = sc.nextInt();

	int arr[] = new int[n];
	int max = Integer.MIN_VALUE;
	for(int i=0; i<n; i++)
	{
		arr[i] = sc.nextInt();
		max = Math.max(max, arr[i]);
	}

	System.out.println(binarySearch(arr, n, k, max));

	}
}