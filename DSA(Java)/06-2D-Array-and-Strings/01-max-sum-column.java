/*
Given a matrix of size M*N, your task is to find the maximum sum of a column.

Input
The first line of input contains two space- separated integers M and N. The next M lines of input contains N space- separated integers each depicting the values of the matrix.

Constraints:-
1 <= M, N <= 100
1 <= Matrix[][] <= 100000

Output
Print the maximum sum between the columns.
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) throws IOException {
    // Your code here
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String str[] = br.readLine().trim().split(" ");
	int m = Integer.parseInt(str[0]);
	int n = Integer.parseInt(str[1]);

	int arr[][] = new int[m][n];
	for(int i=0; i<m; i++)
	{
		str = br.readLine().trim().split(" ");
		for(int j=0; j<n; j++)
		{
			arr[i][j] = Integer.parseInt(str[j]);
		}
	}

	int sum = 0, max = 0;
	for(int j=0; j<n; j++)
	{
		for(int i=0; i<m; i++)
		{
			sum += arr[i][j];
		}
		if(sum>max)
		max = sum;
		sum = 0;
	}

	System.out.println(max);
	}
}