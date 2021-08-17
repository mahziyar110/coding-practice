/*
Given a string(1-indexed). Print all the characters of the string at odd positions.

Input
The first line of the input contains a string S. String contains only lowercase english letters.

Constraints:-
1 <= |S| <= 100

Output
The output should contain the character's at odd positions seperated by space.
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
    // Your code here
	Scanner sc = new Scanner(System.in);
	String str = sc.next();
	for(int i=0; i<str.length(); i+=2)
	{
		System.out.print(str.charAt(i) + " ");
	}
	}
}