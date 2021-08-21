/*
Given an array of size N, your task is to calculate the total sum of maximum and minimum elements in each subarray of size K.
See example for better understanding.

Input
First line of input contains an two space separated integers depicting values of N and K, next line contains N space separated integers depicting values of Arr[i].

Constraints:-
1 < = k < = N < = 100000
-100000 < = Arr[i] < = 100000

Output
Print the required sum
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

	Deque<Integer> dq1 = new LinkedList<>();
	Deque<Integer> dq2 = new LinkedList<>();
	long sum = 0;
	for(int i=0; i<n; i++)
	{
		while(!dq1.isEmpty() && dq1.peekFirst() <= i-k)
		{
			dq1.removeFirst();
		}
		while(!dq1.isEmpty() && arr[dq1.peekLast()]<=arr[i])
		{
			dq1.removeLast();
		}
		dq1.addLast(i);

		while(!dq2.isEmpty() && dq2.peekFirst() <= i-k)
		{
			dq2.removeFirst();
		}
		while(!dq2.isEmpty() && arr[dq2.peekLast()]>=arr[i])
		{
			dq2.removeLast();
		}
		dq2.addLast(i);
		
		
		if(i >= k-1)
		{
			sum+= arr[dq1.peekFirst()] + arr[dq2.peekFirst()];
		}
	}

	System.out.println(sum);
	
	}
}