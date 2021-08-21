/*
Given a number N and a number P, your task is to calculate NP. Since the ans can be very long calculate your ans as NP%M where M = 109+7

Input
Input contains only two integers N and P separated by spaces.

Constraints:-
1 < = N, P <= 1000000000

Output
Print NP%M.
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
    // Your code here
	Scanner sc = new Scanner(System.in);
	long n = sc.nextLong();
	long p = sc.nextLong();
	long m = (long)1e9+7;

	long ans = 1;
	n = n % m;

	while(p > 0)
	{
		if(p%2 == 1)
		{
			ans = (ans * n) % m;
			p--;
		}
		else
		{
			p /= 2;
			n = (n*n) % m;
		}
	}
	System.out.println(ans);
	
	}
}