/*
Given the marks of N students, your task is to calculate the average of the marks obtained.

Input
First line of input contains a single integer N. The next line contains N space separated integers containing the marks of the students.

Constraints:-
1 <= N <= 1000
1 <= marks <= 1000

Output
Print the floor of the average of marks obtained.
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
    int total = 0;
    for (int i=0; i<n; i++)
    {
        int t = sc.nextInt();
        total +=t;
    }
    int avg = total/n;
    System.out.println(avg);
	}
}