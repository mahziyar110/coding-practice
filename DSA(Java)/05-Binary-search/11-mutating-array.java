/*
Given an integer array arr and a target value K, return the integer value V such that when we change all the integers larger than V in the given array to be equal to V, the sum of the array gets as close as possible (in absolute difference) to K.

In case of a tie, return the minimum such integer.

Note: the answer is not necessarily a number from arr.

Input
The input line containing T, denoting the number of testcases. Each testcase contains 2 lines. First line contains N, size of array and target K separated by space. Second line contains elements of array.

Constraints:
1 <= T <= 50
1 <= N <= 10^4
1 <= arr[i], K <= 10^5

Output
For each testcase you need to print the minimum such integer possible in a new line.
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static int arrSum(int arr[], int n, int val)
	{
		int sum = 0;
		for(int i=0; i<n; i++)
		{
			if(arr[i] < val)
			{
				sum += arr[i];
			}
			else
			{
				sum += val;
			}
		}

		return sum;
	}

	public static int binarySearch(int arr[], int n, int k)
	{
		int low = 0;
		int high = arr[n-1];

		while(low < high)
		{
			int mid = (low+high)/2;

			if(arrSum(arr, n, mid) == k)
			{
				return mid;
			}
			else if(arrSum(arr, n, mid) > k)
			{
				high = mid;
			}
			else
			{
				low = mid;
			}

			if(high - low == 1)
			{
				int p = arrSum(arr, n, low);
				int q = arrSum(arr, n, high);
				p = Math.abs(p-k);
				q = Math.abs(q-k);
				if(q < p)
				{
					return high;
				}
				return low;
			}
		}
		return low;
	}

	public static void main (String[] args) {
    // Your code here
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	while(t-- > 0)
	{
		int n = sc.nextInt();
		int k = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);

		System.out.println(binarySearch(arr, n, k));

	}
	
	}
}