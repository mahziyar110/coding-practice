/*
Given an integer N, your task is to check whether the given number is prime or not

Input
The input contains a single integer N.

Constraints:-
1 <= N <= 100000000000

Output
Print "YES" If the given number is prime else print "NO".
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
    if(n == 1)
    {
        System.out.println("NO");
        return;
    }

    for(int i=2; i<= Math.sqrt(n); i++)
    {
        if(n%i == 0)
        {
            System.out.println("NO");
            return;
        }
    }
    System.out.println("YES");
    
    }
}