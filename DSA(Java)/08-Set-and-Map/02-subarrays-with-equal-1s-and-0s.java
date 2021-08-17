/*
Given an array arr[] of size N containing 0s and 1s only. The task is to count the subarrays having an equal number of 0s and 1s.

Input
The first line of the input contains an integer N denoting the size of the array and the second line contains N space-separated 0s and 1s.

Constraints:-
1 <= N <= 10^6
0 <= A[i] <= 1

Output
For each test case, print the count of required sub-arrays in new line.
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
	long arr[] = new long[n];
	for(int i=0; i<n; i++)
	{
		arr[i] = sc.nextInt();
		if(arr[i] == 0)
		{
			arr[i] = -1;
		}
	}
	HashMap<Long, Long> hm = new HashMap<>();
	long count = 0;
	long sum = 0;
	for(int i=0; i<n; i++)
	{
		sum += arr[i];
		if(sum == 0)
		{
			count++;
		}
		if(hm.containsKey(sum))
		{
			count += hm.get(sum);
			hm.put(sum, hm.get(sum)+1);
		}
		else
		{
			hm.put(sum, 1L);
		}
	}
	System.out.println(count);
	
	
	}
}