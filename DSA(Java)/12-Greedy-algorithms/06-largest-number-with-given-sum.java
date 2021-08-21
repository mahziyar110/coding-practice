/*
A boy lost the password of his super locker. He remembers the number of digits N as well as the sum S of all the digits of his password. He know that his password is the largest number of N digits that can be possible with given sum S. As he is busy doing his homework, help him retrieving his password.

Input
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. The first line of each test case contains two space separated integers N and S, where N is the number of digits in password and S is the sum of all the digits of the password.

Constraints:
1 <= T <= 100
1 <= N <= 10^4
0 <= S <= 10^6

Output
Corresponding to each test case, in a new line, print the largest integer if possible , else print -1.
The number should not have any leading zeroes

Note: Since the numbers can be very large, you have to print the answer in String format
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
		int n = sc.nextInt();
		int sum = sc.nextInt();
		int count = 0;
		if(9*n < sum)
		{
			System.out.println(-1);
		}
		else
		{
			int temp = Math.min(9, sum);
			while(sum>=temp && sum>0)
			{
				System.out.print(Integer.toString(temp));
				count++;
				sum -= temp;
				while(sum < temp)
				{
					temp--;
				}
			}
			int zero = n - count;
			while(zero-- > 0)
			{
				System.out.print("0");
			}
			System.out.println();
		}
	}
	
	
	}
}