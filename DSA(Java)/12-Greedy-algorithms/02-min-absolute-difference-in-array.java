/*
Given an integer array A of size N, find the minimum absolute difference between any two elements in the array.
We define the absolute difference between two elements ai and aj (where i != j ) is |ai - aj|.

Input
First line of input contains a single integer N, next line contains N space separated integers containing values of array A.

Constraints :
2 < = N < = 10^5
0 < = A[i] < = 10^10

Output
Print the minimum absolute difference between any two elements of the array.
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
	long arr[] = new long[n];

	for(int i=0; i<n; i++)
	{
		arr[i] = sc.nextLong();
	}
	Arrays.sort(arr);
	long min = Long.MAX_VALUE;
	for(int i=1; i<n; i++)
	{
		min = Math.min(min, arr[i]-arr[i-1]);
	}
	System.out.println(min);
	}
}