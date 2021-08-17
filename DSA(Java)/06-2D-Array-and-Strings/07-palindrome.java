/*
Check if the given string is a palindrome or not?
Palindromes are a numbers, phrases or words that reads same both the ways, backward as well as forward. For example, 1331 is a palindrome because on reversing the digits the number remains the same. But 123 is not a palindrome, as on reversing the digits it becomes 321. So given a number n you have to output whether the number is a palindrome or not.
Print 1 if True and 0 if false.

Input
input contains a single string s.

Constraints:-
1<=|s|<=100000

Note:- String will only contains characters from '0' to '9'.

Output
1 or 0. where 1 means the number is palindrome and zero indicates it's not.
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
	int result = 1;
	for(int i=0; i<str.length()/2; i++)
	{
		if(str.charAt(i) != str.charAt(str.length()-i-1))
		{
			result = 0;
			break;
		}
	}
	System.out.println(result);

	}
}