/*
Given an unsorted array of integers, find the length of the longest consecutive elements sequence.

A consecutive set of integers is a consecutive elements sequence.

See sample for better understanding

Input
First line contains integer N number of elements of the array. Next line contains N space separated integers which are elements of array.
Constraints
1<= N <=100000
1<= A[i] <=100000

Output
Output the longest consecutive sequence in the array.
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

	HashSet<Integer> hs = new HashSet<>();
	for(int i=0; i<n; i++)
	{
		hs.add(sc.nextInt());
	}

	int arr[] = new int[hs.size()];
	int j = 0;
	for(int i : hs)
	{
		arr[j] = i;
		j++;
	}
	Arrays.sort(arr);

	int length = 1;
	int max_length = 1;
	
	for(int i=1; i<arr.length; i++)
	{
		if(arr[i] == (arr[i-1]+1))
		{
			length++;
			max_length = Math.max(max_length, length);
		}
		else
		{
			length = 1;
		}
	}

	System.out.println(max_length);
	
	}
}