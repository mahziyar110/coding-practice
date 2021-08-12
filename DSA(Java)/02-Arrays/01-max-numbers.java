/*
Given an array A of size N (at least three), you need to find its first, second and third maximum elements.

Try solving it in O(N) per test case

Input
The first line of the input contains the number of test cases T.

For each test case, the first line of the input contains an integer N denoting the number of elements in the array A. The next line contains N (space separated) elements of A.


Constraints:
1 <= T <= 100
3 <= N <= 10^6
1 <= A[i] <= 10^9

Note:-It is guaranteed that the sum of N over all text cases does not exceed 10^6

Output
For each test case, output the first, second and third maximum elements in the array.
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
	while(T>0)
	{
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);
		
		System.out.println(arr[n-1] + " " + arr[n-2] + " " + arr[n-3]);

		T--;
	}
	}
}