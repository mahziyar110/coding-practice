/*
Given an array of N elements containing only 0 and 1. Find the length of the largest subarray with an equal number of 0's and 1's.

This problem was asked in Amazon.

Input
Each test case contains two lines. The first line of each test case is a number N denoting the size of the array and in the next line are N space-separated values of A [].

Constraints:-
1 < = N < = 100000

Output
Print the max length of the subarray.
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
    // Your code here
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int arr[] = new int[n];
	for(int i=0; i<n; i++)
	{
		arr[i] = sc.nextInt();
		if(arr[i] == 0)
		{
			arr[i] = -1;
		}
	}
	
	int max_length = 0;
	for(int i=0; i<n; i++)
	{
		int sum = 0;
		for(int j=i; j<n; j++)
		{
			sum += arr[j];
			if(sum == 0)
			{
				max_length = Math.max((j-i+1), max_length);
			}
		}
		if(max_length >= n-i)
		{
			break;
		}

	}
	System.out.println(max_length);

	}
}