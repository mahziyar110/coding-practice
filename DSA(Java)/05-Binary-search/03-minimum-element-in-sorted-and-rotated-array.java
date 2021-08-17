/*
Loki is one mischievous guy. He would always find different ways to make things difficult for everyone. After spending hours sorting a coded array of size N (in increasing order), you realise it’s been tampered with by none other than Loki. Like a clock, he has moved the array thus tampering the data. The task is to find the minimum element in it.

Input
The first line of input contains a single integer T denoting the number of test cases. Then T test cases follow. Each test case consist of two lines. The first line of each test case consists of an integer N, where N is the size of array.
The second line of each test case contains N space separated integers denoting array elements.

Constraints:
1 <= T <= 100
1 <= N <= 10^5
1 <= A[i] <= 10^6

Sum of "N" over all testcases does not exceed 10^5

Output
Corresponding to each test case, in a new line, print the minimum element in the array.
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void binarySearch(int[] arr, int size)
	{
		int low = 0;
		int high = size-1;
		int min = arr[0];
		
		while(low < high)
		{
			int mid = low + (high-low)/2;

			if(mid == 0 && arr[mid]<arr[mid+1] && arr[mid]<arr[size-1])
			{
				min = arr[mid];
				break;
			}
			
			else if(arr[mid-1]>arr[mid] && arr[(mid+1)%size]>arr[mid])
			{
				min = arr[mid];
				break;
			}
			else if(arr[mid] > arr[size-1])
			{
				low = mid + 1;
			}
			else
			{
				high = mid;
			}
			min = arr[high];
		}
		
		System.out.println(min);
	}

	public static void main (String[] args) {
    // Your code here
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	while(t-- > 0)
	{
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}

		binarySearch(arr,n);
	}


	}
}