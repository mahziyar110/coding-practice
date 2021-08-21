/*
Write a program to find the minimum number of coins/ notes required to make the change of A amount of money.
For this problem, you can assume that there is an unlimited supply of the various notes/coins available in the Indian currency denominations. The various denominations available are 1, 2, 5, 10, 20, 50, 100, 200, 500 and 2000.

Input
The first line of the input contains the number of test cases T.
Each test case contains a single input A(amount).

Constraints:
1 <= T <= 100000
1 <= A <= 10^5

Output
For each test case, print the minimum number of changes of amount A.
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
        int dominion[] = new int[]{2000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        int sum = 0;
        for(int i=0; i<10; i++)
        {
            sum += (n/dominion[i]);
            n %= dominion[i];
            if(n == 0)
            {
                break;
            }
        }
        System.out.println(sum);
    }
    
    }
}