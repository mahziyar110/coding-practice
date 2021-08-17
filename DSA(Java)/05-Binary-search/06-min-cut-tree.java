/*
Given an integer K and an array height[] of size N, where height[i] denotes the height of the ith tree in a forest. The task is to make a cut of height X from the ground such that at max K unit wood is collected. Find the minimum value of X

If you make a cut of height X from the ground then every tree with a height greater than X will be reduced to X and remaining part of wood can be collected

Input
The first line contains two integers N and K.
Next line contains N integers denoting the elements of the array height[]

Constraints
1 <= N <= 100000
1 <= arr[i] <= 100000
1 <= K <= 10000000

Output
Print a single integer the value of X.
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static int binarySearch(int arr[], int size, int k, int max)
	{
		int low = 0;
		int high = max;

		while(low < high)
		{
			int mid = low + (high-low)/2;
			
			if(count(arr, size, mid) > k)
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

	public static int count(int arr[], int size, int X)
	{
		int sum = 0;
		for(int i=0; i<size; i++)
		{
			if(arr[i] > X)
			sum += (arr[i] - X);
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
		if(arr[i] > max)
		max = arr[i];
	}

	System.out.println(binarySearch(arr, n, k, max));

	}
}