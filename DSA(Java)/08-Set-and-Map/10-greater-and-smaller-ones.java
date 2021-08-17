/*
Given an unsorted array A of size N and value K. The elements of the array A contains positive integers. You have to print all the elements which are greater than K in the array in sorted order (including K as well if present in the array A), and print all the elements which are smaller than K in sorted order both of them in separate lines. If the elements greater than or equal to K are not present in the array then print "-1". Similarly, in the case of smaller elements print -1 if elements smaller than K doesn’t exist. If a number appears more than once print number more than once.

Input
First line of input contains number of testcases T. For each testcase, there are two lines, first of which contains N and K separated by space, next line contains N space separated integers.


Constraints:
1 <= T <= 100
1 <= N <= 100000
1 <= K <= 1000000
1 <= A[i] <= 1000000
Sum of N over all test cases do not exceed 100000

Output
For each testcase, print the required elements(if any), else print "-1" (without quotes)
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
        int k = sc.nextInt();

        int arr[] = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        if(k > arr[n-1])
        {
            System.out.println(-1);
            for(int i=0; i<n; i++)
            {
                System.out.print(arr[i] + " ");
            }
        }
        
        else if(k <= arr[0])
        {
            for(int i=0; i<n; i++)
            {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            System.out.print(-1);
        }

        else
        {
            int index = 0;
            for(int i=0; i<n; i++)
            {
                if(arr[i] >= k)
                {
                    index = i;
                    break;
                }
            }
            for(int i=index; i<n; i++)
            {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            for(int i=0; i<index; i++)
            {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    }
}