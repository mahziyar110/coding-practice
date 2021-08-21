/*
Given, N Mice and N holes are placed in a straight line. Each hole can accommodate only 1 mouse. A mouse can stay at his position, move one step right from x to x + 1, or move one step left from x to x -1. Any of these moves consumes 1. minute. The task is to assign mice to holes so that the time when the last mouse gets inside a hole is minimized.

Input
First line of input contains a single integer T, which denotes the number of test cases. T test cases follows, first line of each test case contains a single integer N which denotes the number of mice and holes. Second line of each test case contains N space separated integers which denotes the position of mice initially. Third line of each test case also contains N space separated integers which denotes the position of holes.

Constraints:
1 <= T <= 100
1 <= N <= 10^4
-10^4 <= mice[i] <= 10^4
-10^4 <= pos[i] <= 10^4

Sum of "N" over all testcases does not exceed 10^6

Output
For each test case in a new line print the minimum time required in which all the mice can get into the holes.
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
        int mice[] = new int[n];
        int holes[] = new int[n];

        for(int i=0; i<n; i++)
        {
            mice[i] = sc.nextInt();
        }
        
        for(int i=0; i<n; i++)
        {
            holes[i] = sc.nextInt();
        }
        Arrays.sort(mice);
        Arrays.sort(holes);
        int max = Integer.MIN_VALUE;

        for(int i=0; i<n; i++)
        {
            max = Math.max(max, Math.abs(mice[i]-holes[i]));
        }
        System.out.println(max);

    }
    
    }
}