/*
Given an array A[] of size N, containing positive integers. You need to sort the elements of array using Insertion sort algorithm.

Input
First line of the input denotes number of test cases T. First line of the testcase is the size of array N and second line consists of array elements separated by space.

Constraints:
1 <= T <= 100
1 <= N <= 10^3
1 <= A[i] <= 10^3

Output
For each testcase print the sorted array in a new line.
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

		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}

		InsertSort(n, arr);
		
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	}

	public static void InsertSort( int size, int a[])
	{
		for(int i=1; i<size; i++)
		{
			int key = a[i];
			int j = i-1;
			while(j>=0 && a[j]>key)
			{
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = key;
			
		}
	}
}