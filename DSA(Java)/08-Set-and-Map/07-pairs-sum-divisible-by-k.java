/*
Given an array of N integers and an integer K, your task is to calculate the count of pairs whose sum is divisible by K.

Input
The first line of input contains two integers N and K, the next line contains N space-separated integers depicting values of an array.

Constraints:-
1 < = N < = 100000
1 < = Arr[i] <= 100000
1 <= K <= 100000

Output
Print the count of required pairs.
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
	long arr[] = new long[k];
	long count = 0;

	for(int i=0; i<n; i++)
	{
		int x = sc.nextInt();
		
		count += arr[(k-(x%k))%k];
		arr[x%k]++;

	}
	System.out.println(count);
	
	}
}