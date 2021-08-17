/*
You are given an array A (distinct integers) of size N, and you are also given a sum. You need to find if two numbers in A exists that have sum equal to the given sum.

Input
The first line of input contains T denoting the number of testcases. T testcases follow. Each testcase contains two lines of input. The first line contains N denoting the size of the array A and target sum. The second line contains N elements of the array.

Constraints:
1 <= T <= 100
1 <= N <= 10^4
1 <= sum <= 10^5
1 <= A[i] <= 10^4

Output
For each testcase, in a new line, print "1"(without quotes) if any pair found, othwerwise print "0"(without quotes) if not found.
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
		int sum = sc.nextInt();
		int flag = 0;
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i=0; i<n; i++)
		{
			int key = sc.nextInt();
			if(hm.containsKey(key))
			{
				hm.put(key, hm.get(key)+1);
			}
			else
			{
				hm.put(key, 1);
			}
		}
		
		for(Map.Entry<Integer, Integer> i : hm.entrySet())
		{
			int target = sum-i.getKey();
			if(hm.containsKey(target))
			{	
				if((target != i.getKey()) || ((target == i.getKey()) && (i.getValue()>1)))
				flag = 1;
				break;
			}
			
		}
		System.out.println(flag);
	}
	
	
	}
}