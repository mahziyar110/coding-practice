/*
Given an array A of size n, and an integer k. Find the maximum force by involving only k elements. Force of an element is the square of its value.

Note: Elements are not needed to be continuous.

Input
The first line of the input contains two integers denoting n and k.
Next line contains n integers denoting elements of the array.

Constraints:
1 < = k < = n < = 1000
-10^7 <= A[i] <= 10^7

Output
Output the maximum force.
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
	long arr[] = new long[n];
	for(int i=0; i<n; i++)
	{
		arr[i] = sc.nextInt();
		if(arr[i]<0)
		arr[i] *= -1;
	}

	Arrays.sort(arr);
	long sum = 0;
	while(k>0)
	{
		sum += (arr[n-1]*arr[n-1]);
		k--;
		n--;
	}

	System.out.println(sum);
	}
}