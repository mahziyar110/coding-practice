/*
Given an array A of size N containing 0's, 1's and 2's. The task is to segregate the 0's, 1's and 2's in the array as all the 0's should appear in the first part of the array, 1's should appear in middle part of the array and finally all the 2's in the remaining part of the array.

Note: Do not use inbuilt sort function. Try to solve in O(N) per test case

Input
The first line contains an integer T denoting the total number of test cases. Then T testcases follow.
Each testcases contains two lines of input. The first line denotes the size of the array N.
The second lines contains the elements of the array A separated by spaces.

Constraints:
1 <= T <= 100
1 <= N <= 100000
0 <= Ai <= 2

Sum of N for each test case does not exceed 10^5

Output
For each testcase, in a newline, print the sorted array.
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
    // Your code here

	Scanner sc = new Scanner(System.in);
	int T = sc.nextInt();

	while(T-- > 0)
	{
		int n = sc.nextInt();
		int arr[] = new int[n];
		int zero=0, one=0, two=0;
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
			if(arr[i] == 0)
			zero++;
			else if(arr[i] == 1)
			one++;
			else two++;
		}

		for(int i=0; i<zero; i++)
		{
			System.out.print(0 + " ");
		}

		for(int i=0; i<one; i++)
		{
			System.out.print(1 + " ");
		}

		for(int i=0; i<two; i++)
		{
			System.out.print(2 + " ");
		}

		System.out.println();
	}

	}
}