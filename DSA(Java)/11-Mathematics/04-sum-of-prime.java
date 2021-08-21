/*
Given a number (greater than 2), print two prime numbers whose sum will be equal to given number, else print -1 if no such number exists.

NOTE: A solution will always exist if the number is even. Read Goldbach’s conjecture.

If [a, b] is one solution with a <= b, and [c, d] is another solution with c <= d, and a < c then print [a, b] only
and not all possible solutions.

Input
The first line contains an integer T, depicting total number of test cases. Then following T lines contains an integer N.

Constraints:
1 ≤ T ≤ 100
2 ≤ N ≤ 1000000

Output
Print the two prime numbers in a single line with space in between if exist else print -1.
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static boolean isPrime(int n)
    {
        if(n == 1)
        {
                return false;
        }

        for(int i=2; i<= Math.sqrt(n); i++)
        {
                if(n%i == 0)
                {
                    return false;
                }
        }
        return true;
    }

	public static void main (String[] args) {
    // Your code here
	Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();
    while(t-- > 0)
    {
        int flag = 0;
        int n = sc.nextInt();
        for(int i=2; i<=(n/2); i++)
        {
            if(isPrime(i) && isPrime(n-i))
            {
                System.out.println(i + " " + (n-i));
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