/*
Given an array A and an integer K. Find the maximum for each and every contiguous subarray of size K.


Problem asked in Amazon, Flipkart.

Input
The first line of each test case contains a single integer N denoting the size of array and the size of subarray K. The second line contains N space-separated integers A1, A2, ..., AN denoting the elements of the array.

Constraints:
1 ≤ N ≤ 10^5
1 ≤ K ≤ N
0 ≤ A[i] <= 10^5

Output
Print the maximum for every subarray of size K.
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
	int k = sc.nextInt();

	int arr[] = new int[n];
	for(int i=0; i<n; i++)
	{
		arr[i] = sc.nextInt();
	}

	Deque<Integer> dq = new LinkedList<>();
	for(int i=0; i<n; i++)
	{
		while(!dq.isEmpty() && dq.peekFirst() <= i-k)
		{
			dq.removeFirst();
		}
		while(!dq.isEmpty() && arr[dq.peekLast()]<=arr[i])
		{
			dq.removeLast();
		}
		dq.addLast(i);
		if(i >= k-1)
		{
			System.out.print(arr[dq.peekFirst()] + " ");
		}
	}
	
	}
}