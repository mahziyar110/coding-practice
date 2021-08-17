/*
Given an array of N integers, give the number with maximum frequency. If multiple numbers have maximum frequency print the maximum number among them.

Input
The first line of the input contains an integer N, Second lines contains N space seperated integers of array.

Constraints
3 <= N <= 1000
1 <= Arr[i] <= 100

Output
The output should contain single integer, the number with maximum frequency.If multiple numbers have maximum frequency print the maximum number among them.
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
	HashMap<Integer, Integer> hm = new HashMap<>();
	int max_freq = 0;
	int max_freq_key = 0;

	for(int i=0; i<n; i++)
	{
		int key = sc.nextInt();
		if(hm.containsKey(key))
		{
			hm.put(key, hm.get(key)+1);

			if(hm.get(key) > max_freq)
			{
				max_freq = hm.get(key);
				max_freq_key = key;
			}
			else if(hm.get(key) == max_freq)
			{
				if(key > max_freq_key)
				{
					max_freq_key = key;
				}
			}
		}
		else
		{
			hm.put(key, 1);

			if(hm.get(key) > max_freq)
			{
				max_freq = hm.get(key);
				max_freq_key = key;
			}
			else if(hm.get(key) == max_freq)
			{
				if(key > max_freq_key)
				{
					max_freq_key = key;
				}
			}
		}
	}
	System.out.println(max_freq_key);
	
	
	}
}