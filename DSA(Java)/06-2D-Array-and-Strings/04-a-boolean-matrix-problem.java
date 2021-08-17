/*
You are given a matrix Mat of m rows and n columns. The matrix is boolean so the elements of the matrix can only be either 0 or 1.
Now, if any row of the matrix contains a 1, then you need to fill that whole row with 1. After doing the mentioned operation, you need to print the modified matrix.

Input
The first line of input contains T denoting the number of testcases. T testcases follow.
The first line of each testcase contains m and n denoting number of rows and number of columns.
Then next m lines contain n elements denoting the elements of the matrix.

Constraints:
1 <= T <= 20
1 <= m, n <= 700
Mat[I][j] ∈ {0,1}

Output
For each testcase, in a new line, print the modified matrix.
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) throws IOException {
    // Your code here
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	int t = Integer.parseInt(br.readLine().trim());
	while(t-- > 0)
	{
	String str[] = br.readLine().trim().split(" ");	
    int n = Integer.parseInt(str[0]);
    int m = Integer.parseInt(str[1]);
    int arr[][] = new int[n][m];
	int flag = 0;
    for(int i=0; i<n; i++)
    {	str = br.readLine().trim().split(" ");
        for(int j=0; j<m; j++)
        {
            arr[i][j] = Integer.parseInt(str[j]);
			if(arr[i][j] == 1)
			flag = 1;
        }
		if(flag == 1)
		{
			for(int j=0; j<m; j++)
			{
				arr[i][j] = 1;
			}
		}
		flag = 0;
    }

	for(int i=0; i<n; i++)
	{
		for(int j=0; j<m; j++)
		{
			System.out.print(arr[i][j] + " ");
		}
		System.out.println();
	}

	}
    
	}
}