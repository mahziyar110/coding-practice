/*
Given an integer N. The task is to find the square root of N. If N is not a perfect square, then return floor(√N).

Try to solve the problem using Binary Search.

Input
The first line of input contains number of testcases T. For each testcase, the only line contains the number N.

Constraints:
1 ≤ T ≤ 10000
0 ≤ x ≤ 100000000

Output
For each testcase, print square root of given integer.
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static long binarySearch(long n)
	{
		if(n==0 || n==1)
		{
			return n;
		}

		long low = 1;
		long high = n;
		long sqrt = 0;
		while(low <= high)
		{
			long mid = (low + high)/2;
			if(mid*mid == n)
			{
				return mid;
			}
			else if(mid*mid < n)
			{
				if((mid+1)*(mid+1) > n)
				return mid;
				else{
					low = mid + 1;
					sqrt = mid;
				}
			}
			else
			{
				high = mid - 1;
			}
		}
		return sqrt;
	}


	public static void main (String[] args) {
    // Your code here
	Scanner sc = new Scanner(System.in);
	int T = sc.nextInt();
	while(T-- > 0)
	{
		long n = sc.nextLong();
		System.out.println(binarySearch(n));
	}

	}
}