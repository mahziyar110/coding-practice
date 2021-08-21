/*
Given two integers ‘a’ and ‘m’. The task is to find modular multiplicative inverse of ‘a’ under modulo ‘m’.
Note: Print the smallest modular multiplicative inverse.

Input
First line of input contains a single integer T denoting number of test cases, next T lines contains two space separated integers depicting value of a and m.

Constraints :-
1 < = T < = 100
1 < = m < = 100
1 < = a < = m

Output
For each test case, in a new line print the modular multiplicative inverse if exist else print -1.
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
    // Your code here
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();

	while(t-- > 0)
	{
		int flag = 0;
		int a = sc.nextInt();
		int m = sc.nextInt();
		a = a % m;
		for(int i=1; i<m; i++)
		{
			if((a * i) % m == 1)
			{
				System.out.println(i);
				flag = 1;
				break;
			}
		}
		if(flag == 0)
		{
			System.out.println(-1);
		}
	}
	
	}
}