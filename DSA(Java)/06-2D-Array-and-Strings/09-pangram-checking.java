/*
Given a string S check if it is Pangram or not. A pangram is a sentence containing every letter in the English Alphabet.

Input
First line of input contains of an integer T denoting number od test cases then T test cases follow. Each testcase contains a String S.

Constraints:
1 <= T <= 100
1 <= |S| <= 1000

Note:- String will not contain any spaces

Output
For each test case print in a new line 1 if its a pangram else print 0.
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

		String str = sc.next();
		str = str.toLowerCase();

		boolean[] flag = new boolean[26];

		for(int i=0; i<str.length(); i++)
		{
			flag[(int)str.charAt(i) - 97] = true;
		}
		
		int result = 1;
		for(int i=0; i<26; i++)
		{
			if(!flag[i])
			{
				result = 0;
				break;
			}
		}
		System.out.println(result);

		}
	}
}