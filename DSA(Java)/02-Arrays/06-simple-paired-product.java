/*
Given an array A of size N (N is always even), you need to find exactly (N/2) numbers where each number represents the pair-wise product of consecutive elements of the array A.

In simple terms print (A[1]*A[2]), (A[3]*A[4]), ..., (A[N-1]*A[N]).


(Use long long int to avoid overflow)

Input
For each test case, the first line of the input contains an integer N (even number) denoting the number of elements in the array. The next line contains N (white-space separated) integers.

Constraints
1 <= N <= 10^2
1 <= A[i] <= 1000000000

Output
For each test case, output N/2 elements representing the pairwise product of adjacent elements in the array.
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
			arr[i] = sc.nextInt();
		}

		for(int i=0; i<n; i+=2)
		{
			System.out.print((arr[i]*arr[i+1]) + " ");
		}
	
	}
}