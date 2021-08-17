/*
Given an array containing N integers and an integer K. Your task is to find the length of the longest Sub-Array with sum of the elements equal to the given value K.

Input
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case consists of two lines. The first line of each test case contains two integers N and K and the second line contains N space-separated elements of the array.

Constraints:-
1<=T<=500
1<=N,K<=10^5
-10^5<=A[i]<=10^5

Sum of N over all test cases does not exceed 10^5

Output
For each test case, print the required length of the longest Sub-Array in a new line. If no such sub-array can be formed print 0.
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) throws IOException {
    // Your code here
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int t = Integer.parseInt(br.readLine());
	while(t-- > 0)
	{
		String str[] = br.readLine().trim().split(" ");
		int n = Integer.parseInt(str[0]);
		int k = Integer.parseInt(str[1]);

		int arr[] = new int[n];
		str = br.readLine().trim().split(" ");
		for(int i=0; i<n; i++)
		{
			arr[i] = Integer.parseInt(str[i]);
		}

		int length = 0;
		int sum = 0;

		HashMap<Integer, Integer> hm = new HashMap<>();
		
		for(int i=0; i<n; i++)
		{
			sum += arr[i];
			if(sum == k)
			{
				length = i+1;
			}
			if(hm.containsKey(sum-k))
			{
				length = Math.max(length, i-hm.get(sum-k));
			}
			if(!hm.containsKey(sum))
			{
				hm.put(sum, i);
			}
		}
		System.out.println(length);
		
	}
	
	
	}
}