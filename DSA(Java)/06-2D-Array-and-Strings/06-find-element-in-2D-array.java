/*
Given a 2D matrix of size [M, N], Q number of queries. In each query, you will be given a number X to check whether it is present in the matrix or not.

Input
The first line contains three integers M(number of rows), N(Number of columns), and Q(number of queries)
Next M lines contain N integers which are the elements of the matrix.
Next, Q lines will contain a single integer X.

Constraints:-
1<=M,N<=1000
1<=Q<=10000
1<=X, Arr[i]<=1000000000

Output
For each query, in a new line print "Yes" if the element is present in matrix or print "No" if the element is absent.
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static String isPresent(int arr[], int size, int q)
	{
		int low = 0;
		int high = size - 1;

		while(low <= high)
		{
			int mid = low + (high-low)/2;
			
			if(arr[mid] == q)
			{
				return "Yes";
			}

			else if(arr[mid] < q)
			{
				low = mid + 1;
			}
			else high = mid + 1;
		}
		return "No";
	}


	public static void main (String[] args) {
    // Your code here
	Scanner sc = new Scanner(System.in);
	int m = sc.nextInt();
	int n = sc.nextInt();
	int q = sc.nextInt();

	int arr[] = new int[m*n];
	for(int i=0; i<(m*n); i++)
	{
		arr[i] = sc.nextInt();
	}
	Arrays.sort(arr);
	while(q-- > 0)
	{
		int query = sc.nextInt();
		System.out.println(isPresent(arr, m*n, query));
	}


	}
}