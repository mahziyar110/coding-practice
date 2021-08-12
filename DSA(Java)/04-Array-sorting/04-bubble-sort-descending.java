/*
Given an array, sort the array in reverse order by simply swapping its adjacent elements.

Input
First line of the input contains an integer, N, which denotes the length of the array. Next N inputs are elements of the array that is to be sorted in descending order.

Constraints
1<=N<=1000
-10000<=Arr[i]<=100000

Output
Output sorted array in descending order where each element is space separated.
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

		BubbleSort(n, arr);
		
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	
	}

	public static void BubbleSort( int size, int a[])
	{
		for(int i=0; i<size-1; i++)
		{
			for(int j=0; j<size-i-1; j++)
			{
				if(a[j]<a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
}