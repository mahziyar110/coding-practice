/*
Implement pow(X, N), which calculates x raised to the power N i.e. (X^N).
Try using a recursive approach

Input
The first line contains T, denoting the number of testcases. Each testcase contains single line containing X, N.

Constraints:
1 <= T <= 100
-10.00 <= X <= 10.00
-10 <= N <= 10

Output
For each testcase you need to print the value of X^N. Print upto two places of decimal.

Note: Please take care that output can be very large but it will not exceed double data type value.
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static double power(double x, double n)
	{
		if(n==0)
		return 1;

		else if(n>0)
		return x*power(x,n-1);
		
		else return (1/x)*power(x,n+1);
				
	}

	public static void main (String[] args) {
    // Your code here
	Scanner sc = new Scanner(System.in);
	int T = sc.nextInt();
	while(T-- >0)
	{
		double X = sc.nextDouble();
		double N = sc.nextDouble();
		double result = power(X,N);
		System.out.format("%.2f\n",result);
	}
	}
}