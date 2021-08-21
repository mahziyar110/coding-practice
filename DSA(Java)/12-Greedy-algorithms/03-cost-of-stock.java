/*
The cost of stock on each day is given in an array A[] of size N. You can either buy or sell a stock on a particular day. You need to sell the previous stock before buying a new one. Find all the days on which you buy and sell the stock so that in between those days your profit is maximum.

There are no two days with same price of the stock.

See sample for a better explanation.

Input
First-line contains an integer value N denoting the number of days, followed by an array of stock prices of N days.

Constraints:
1 <= N <= 10^5
1 <= A[i] <= 10^6

Output
For each array of input, print an output with a pair of integers (a, b) where a represents day to buy stock and b represents day of selling stock. Output may contain of more than one pair, print them in all seperate line(assume 0 base indexing).

For no profit, print null.
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
	int arr[] = new int[n];
	for(int i=0; i<n; i++)
	{
		arr[i] = sc.nextInt();
	}
	ArrayList<Integer> list = new ArrayList<>();
	boolean hasStock = false;
	for(int i=0; i<n-1; i++)
	{
		if(arr[i]<arr[i+1])
		{
			if(!hasStock)
			{
				list.add(i);
				hasStock = true;
			}
		}
		else if(hasStock)
		{
			list.add(i);
			hasStock = false;
		}
	}
	if(hasStock)
	{
		list.add(n-1);
	}
	if(list.isEmpty())
	{
		System.out.println("null");
		return;
	}
	for(int i=0; i<list.size(); i+=2)
	{
		System.out.println(list.get(i)+" "+list.get(i+1));
	}
	
	
	}
}