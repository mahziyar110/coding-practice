/*
There are N trees in Terry's front yard. He is supposed to measures the height of each tree and find the average height of trees in his yard. What is the average height of a tree in Terry's front yard?

Note:- Print your answer as floor value (average height)

Input
The first line contains N: numbers of tree.
Then follows N lines represents the height of each tree.

Constraint:-
1 <= n <= 100000
1 <= a[i] <= 100000

Output
Print the average height of all the trees in the yard
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
		double sum = 0;
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
			sum+=arr[i];
		}

		int avg = (int)(sum/n);
		System.out.println(avg);

	}
}