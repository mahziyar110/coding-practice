/*
Given an infix expression, your task is to convert it into postfix.

Infix expression: The expression of the form a operator b. When an operator is in- between every pair of operands.
Postfix expression: The expression of the form a b operator. When an operator is followed for every pair of operands.

Valid operators are +, - , *, /, ^. Each operand is an uppercase english alphabet. Infix expression may contains parenthesis as '(' and ')'.

See example for better understanding.

Input
The input contains a single string of infix expression.

Constraints:-
1 <= |String| <= 40

Output
Output the Postfix expression.
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static int prec(char c)
	{
		switch(c)
		{
			case '+':
			case '-': return 1;
			case '*':
			case '/': return 2;
			case '^': return 3;
		}
		return -1;
	}

	public static void main (String[] args) {
    // Your code here
	Scanner sc = new Scanner(System.in);
	String str = sc.next();
	String result = "";
	Stack<Character> st = new Stack<>();

	for(int i=0; i<str.length(); i++)
	{
		char c = str.charAt(i);
		int alpha = (int)(c-'A');

		if(alpha>=0 && alpha<=25)
		{
			result += c;
		}
		else if(c == '(')
		{
			st.push(c);
		}
		else if(c == ')')
		{
			while(st.peek() != '(')
			{
				result += st.pop();
			}
			st.pop();
		}
		else
		{
			while(!st.empty() && prec(c) <= prec(st.peek()))
			{
				result += st.pop();
			}
			st.push(c);
		}

	}
	while(!st.empty())
	{
		result += st.pop();
	}
	System.out.println(result);
	
	}
}