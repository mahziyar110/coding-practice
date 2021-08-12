/*
Given an array A[], of size N containing positive integers. You need to print the elements of array in increasing order.

Input
First line of the input denotes the number of test cases 'T'. First line of the test case is the size of array and second line consists of array elements.

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

		BubbleSort(n, arr);
		
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	}

	public static void BubbleSort( int size, int a[])
	{
		for(int i=0; i<size-1; i++)
		{
			for(int j=0; j<size-i-1; j++)
			{
				if(a[j]>a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
}