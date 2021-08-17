/*
Given an array A[] of size N and an integer K. Print the count of distinct numbers in all subarrays of size k in the array A[].

Input
The first line of input contains two integers N and K. The next line contains N space separated values of the array A[].

Constraints:-
1 <= N, K <= 100000
1 <= A[] <= 1000000000

Output
Print the space separated values denoting counts of distinct numbers in all subarrays of size k in the array A[].
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) throws IOException{
    // Your code here
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String str[] = br.readLine().trim().split(" ");
	int n = Integer.parseInt(str[0]);
	int k = Integer.parseInt(str[1]);
	// long arr[] = new long[n];
	str = br.readLine().trim().split(" ");

	HashMap<Integer, Integer> hm = new HashMap<>();

	for(int i=0; i<n; i++)
	{
		if(i<k-1)
		{
			// arr[i] = Long.parseLong(str[i]);
			if(hm.containsKey(Integer.parseInt(str[i])))
			{
				hm.put(Integer.parseInt(str[i]), hm.get(Integer.parseInt(str[i]))+1);
			}
			else
			{
				hm.put(Integer.parseInt(str[i]),1);
			}
		}
		else
		{
			// arr[i] = Long.parseLong(str[i]);
			// HashSet<Long> hs = new HashSet<>();
			// for(int j=i-k+1; j<=i; j++)
			// {
			// 	hs.add(arr[j]);
			// }
			// System.out.println(hs);
			if(hm.containsKey(Integer.parseInt(str[i])))
			{
				hm.put(Integer.parseInt(str[i]), hm.get(Integer.parseInt(str[i]))+1);
			}
			else
			{
				hm.put(Integer.parseInt(str[i]),1);
			}

			System.out.print(hm.size() + " ");

			hm.put(Integer.parseInt(str[i-k+1]), hm.get(Integer.parseInt(str[i-k+1]))-1);
			if(hm.get(Integer.parseInt(str[i-k+1])) == 0)
			{
				hm.remove(Integer.parseInt(str[i-k+1]));
			}
		}
	}
	
	
	}
}