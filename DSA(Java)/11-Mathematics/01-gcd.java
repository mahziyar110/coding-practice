/*
Given 2 non-negative integers m and n, find gcd(m, n)
GCD of 2 integers m and n is defined as the greatest integer g such that g is a divisor of both m and n. Both m and n fit in a 32 bit signed integer.

NOTE: DO NOT USE LIBRARY FUNCTIONS

Input
Input contains two space separated integers, m and n

Constraints:-
1 < = m, n < = 10^18

Output
Output the single integer denoting the gcd of the above integers.
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

	public static long gcd(long m, long n){

		if(m==0){
			return n;
		}
		return gcd(n%m,m);
	}
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long m = sc.nextLong();
		long n = sc.nextLong();
		long result = gcd(m,n);
		
		System.out.print(result);
                      
	}
}