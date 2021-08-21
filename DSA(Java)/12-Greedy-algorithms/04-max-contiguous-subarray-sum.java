/*
Given an array, A of length N, find the contiguous subarray within A which has the largest sum.

Input
First line of each test case contain the number of test cases.
The first line of each test case contains an integer n, the length of the array A
and the next line contains n integers.

Constraints:
1<=T<=100
1 <= N <= 10^5
-10^6 <= A[i] <= 10^6

Output
Output an integer representing the maximum possible sum of the contiguous subarray.
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
    // Your code here
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	while(t-- > 0)
	{
		int n = sc.nextInt();
		long arr[] = new long[n];
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextLong();
		}
		long max = Long.MIN_VALUE;
		long sum = 0;
		for(int i=0; i<n; i++)
		{
			sum += arr[i];
			max = Math.max(max, sum);
			if(sum < 0)
			{
				sum = 0;
			}
		}
		System.out.println(max);
	}
	
	}
}