/*
Given an array A of size N (N is always even), you need to find exactly (N/2) numbers where each number represents the pair-wise sum of consecutive elements of the array A.

In simple terms print (A[1]+A[2]), (A[3]+A[4]), ..., (A[N-1]+A[N]).

Input
The first line of the input contains the number of test cases T.

For each test case, the first line of the input contains an integer N(even number) denoting the number of elements in the array. The next line contains N (white-space separated) integers.


Constraints
1 <= N <= 100
1 <= A[I] <= 1000000000

Output
For each test case, output N/2 elements representing the pairwise sum of adjacent elements in the array.
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
		}

		for(int i=0; i<n; i+=2)
		{
			System.out.print((arr[i]+arr[i+1]) + " ");
		}
	
	}
}