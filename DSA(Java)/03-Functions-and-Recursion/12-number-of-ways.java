/*
Find number of ways an integer N can be represented as a sum of unique natural numbers.

Input
First line contain an integer T denoting number of test cases. Each test case contains a single integer N.

Constraint:-
1 <= T <= 100
0 <= N <= 120

Output
Print a single integer containing number of ways.
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

	public static int count = 0;

	public static void ways(int num, int start)
	{
		if(num == 0)
		count++;

		else if(num < start)
		return;

		for(int i=start; i<=num; i++)
		{
			ways(num-i, i+1);
		}
	}

	public static void main (String[] args) {
    // Your code here
	Scanner sc = new Scanner(System.in);
	int T = sc.nextInt();
	while(T-- > 0)
	{
		int n = sc.nextInt();
		if(n<=0)
		{
			System.out.println(0);
			continue;
		}
		count = 0;
		ways(n,1);
		System.out.println(count);
	}

	}
}