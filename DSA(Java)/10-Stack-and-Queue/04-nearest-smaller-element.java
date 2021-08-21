/*
Given an array A, find the nearest smaller element S[i] for every element A[i] in the array such that the element has an index smaller than i.

More formally,
S[i] for an element A[i] = an element A[j] such that
j is maximum possible AND
j < i AND
A[j] <= A[i]
Elements for which no smaller element exist, consider next smaller element as -1.

Input
The first line contains the size of array, n
The next line n elements of the integer array, A[i]

Constraints:
1 <= n <= 10^5
1 <= A[i] <= 10^6

Output
Print the integer array S such that S[i] contains nearest smaller number than A[i] such than index of S[i] is less than 'i'. If no such element occurs S[i] should be -1.
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

	Stack<Integer> st = new Stack<>();

	for(int i=0; i<n; i++)
	{
		while(!st.empty() && arr[i]<st.peek())
		{
			st.pop();
		}
		System.out.print(st.empty() ? -1+" " : st.peek()+" ");
		st.push(arr[i]);
		
	}
	
	
	
	}
}