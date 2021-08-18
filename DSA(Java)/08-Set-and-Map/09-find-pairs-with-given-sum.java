/*
Given an array of integers, and an integer ‘K’, find the count of pairs of elements in the array whose sum is equal to 'K'.

Input
The first line of the input contains 2 space separated integers N and K denoting the size of array and the sum respectively.
The second line of the input contains N space separated integers denoting the elements of the array.

Constraints:
1 <= N <= 100000
1 <= K <= 100000
1 <= A[i] <= 100000

Output
Print the count of pairs of elements in the array whose sum is equal to the K.
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
	int sum = sc.nextInt();
	long count = 0;
	HashMap<Long, Long> hm = new HashMap<>();
	for(int i=0; i<n; i++)
	{
		long key = sc.nextLong();
		if(hm.containsKey(key))
		{
			hm.put(key, hm.get(key)+1);
		}
		else
		{
			hm.put(key, 1L);
		}
	}

	for(Map.Entry<Long, Long> i : hm.entrySet())
	{
		// System.out.println(i);
		long target = sum - i.getKey();
		// System.out.println(target);
		if(hm.containsKey(target))
		{	
			if(i.getKey() == target)
			{
				count += (i.getValue()*(i.getValue()-1))/2;
				// System.out.println("++" + (i.getValue()-1));
			}
			else
			{
				count += (i.getValue()*hm.get(target));
				// System.out.println("++" + i.getValue()*hm.get(target));
				hm.put(target, 0L);
			}
		}
		
	}
	System.out.println(count);
	
	
	}
}