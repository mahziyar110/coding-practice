/*
Given an array of N strings, find the longest common prefix among all strings present in the array.
Problem asked in Amazon, Flipkart.

Input
The fist line of each test contains a single integer N. Next line has space-separated N strings.

Constraints:-
1 <= N <= 10^3
1 <= |S| <= 10^3

Output
Print the longest common prefix as a string in the given array. If no such prefix exists print "-1"(without quotes).
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
    String str[] = new String[n];
    int min = Integer.MAX_VALUE;
    for(int i=0; i<n; i++)
    {
        str[i] = sc.next();
        if(str[i].length() < min)
        {
            min = str[i].length();
        }
    }

    String solution = "";
    for(int i=0; i<min; i++)
    {
        int j;
        for(j=1; j<n; j++)
        {
            if(str[0].charAt(i) != str[j].charAt(i))
            break;
        }
        if(j == n)
        {
            solution += String.valueOf(str[0].charAt(i));
        }
        else
        {
            break;
        }

    }

    if(solution == "")
    {
        System.out.println(-1);
    }
    else
    {
        System.out.println(solution);
    }
    

	}
}