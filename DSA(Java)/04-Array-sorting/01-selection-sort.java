/*
Given an array A[], size N containing positive integers. You need to arrange the elements of array in increasing order.

Input
First line of the input denotes number of test cases 'T'. First line of the test case is the size of array and second line consists of array elements.

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

		SelSort(n, arr);
		
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	}

	public static void SelSort( int size, int a[])
	{
		for(int i=size-1; i>0; i--)
		{
			int max = i;
			for(int j=0; j<=i; j++)
			{
				if(a[j]>a[max])
				{
					max = j;
				}
			}
			int temp = a[i];
			a[i] = a[max];
			a[max] = temp;
		}
	}
}