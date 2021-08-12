/*
Given an array Arr of N integers, your task is to print the sum of elements present at even places and print the product of elements present at the odd places.

Note:- Consider the first element to start from 1.

Input
The first line of input contains a single integer N, the next line of input contains N space- separated integers depicting the values of the array.

Constraints:-
1 <= N <= 50
1 <= Arr[i] <= 5

Output
Print the sum of elements present at even places and print the product of elements present at the odd places separated by a space.
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
		int arr[] = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}

        int sum = 0;
        int product = 1;

		for(int i=0; i<n; i+=2)
		{
			product*=arr[i];
		}

        for(int i=1; i<n; i+=2)
		{
			sum+=arr[i];
		}

        System.out.println(sum + " " + product);
	}
}