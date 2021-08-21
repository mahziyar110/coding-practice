/*
Given a number n find the number of prime numbers less than equal to that number.

Input
There is only one integer containing value of n.

Constraints:-
1 <= n <= 10000000

Output
Return number of primes less than or equal to n
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
      int n = sc.nextInt();
      int count = 0;
      for(int i=1; i<=n; i++)
      {
            if(isPrime(i))
            count++;
      }
      System.out.println(count);
      
      
      }
}