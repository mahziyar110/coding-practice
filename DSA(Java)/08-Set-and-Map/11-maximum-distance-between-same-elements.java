/*
Given an array with repeated elements, the task is to find the maximum distance between two occurrences of an element.

Note:- It is guaranteed that atleast one number is repeated.

Input
The first line of the input contains an integer N denoting the number of elements in the array, the next line contains N space separated integers.

Constraints:
1 <= N <= 100000
1 <= Arr[i] <= 10^9

Output
For each test case in new line print the Maximum distance between two occurrences of an element
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
	int length = 0;
	HashMap<Long, Integer> hm = new HashMap<>();
	for(int i=0; i<n; i++)
	{
		long key = sc.nextLong();

		if(hm.containsKey(key))
		{
			length = Math.max(length, (i-hm.get(key)));
		}
		else
		{
			hm.put(key, i);
		}
	}
	System.out.println(length);
	
	
	}
}