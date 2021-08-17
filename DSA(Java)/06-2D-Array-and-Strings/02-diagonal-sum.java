/*
Given a matrix of size N*N, your task is to find the sum of the primary and secondary diagonal of the matrix.

For Matrix:-
M00 M01 M02
M10 M11 M12
M20 M21 M22

Primary diagonal:- M00 M11 M22
Secondary diagonal:- M02 M11 M20

Input
The first line of input contains a single integer N, The next N lines of input contains N space-separated integers depicting the values of the matrix.

Constraints:-
1 <= N <= 500
1 <= Matrix[][] <= 100000

Output
Print the sum of primary and secondary diagonal separated by a space.
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) throws IOException {
    // Your code here
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	int n = Integer.parseInt(br.readLine().trim());
	String str[];
	int arr[][] = new int[n][n];
	for(int i=0; i<n; i++)
	{
		str = br.readLine().trim().split(" ");
		for(int j=0; j<n; j++)
		{
			arr[i][j] = Integer.parseInt(str[j]);
		}
	}
	long sum1 = 0, sum2 = 0;
	for(int i=0; i<n; i++)
	{
		sum1 += arr[i][i];
	}
	
	for(int i=0, j=n-1; i<n; i++, j--)
	{
		sum2 += arr[i][j];
	}
	System.out.println(sum1 + " " + sum2);

	}
}