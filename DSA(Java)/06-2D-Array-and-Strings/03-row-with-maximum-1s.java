/*
Given a boolean matrix of size N*M in which each row is sorted your task is to print the index of the row containing maximum 1's. If multiple answer exist print the smallest one.

Input
First line contains two space separated integers denoting values of N and M. Next N lines contains M space separated integers depicting the values of the matrix.

Constraints:-
1 < = M, N < = 1000
0 < = Matrix[][] < = 1

Output
Print the smallest index (0 indexing) of a row containing the maximum number of 1's.
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
    int m = sc.nextInt();
    int arr[][] = new int[n][m];
    int sum = 0, max = 0, index = 0;
    for(int i=0; i<n; i++)
    {
        for(int j=0; j<m; j++)
        {
            arr[i][j] = sc.nextInt();
            sum += arr[i][j];
            if(sum>max)
            {
                max = sum;
                index = i;
            }
        }

        sum = 0;
    }
    System.out.println(index);
    
	}
}