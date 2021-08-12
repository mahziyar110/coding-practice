/*
John has N candies. He want to crush all of them. He feels that it would be boring to crush the candies randomly, so he devices a method to crush them. He divides these candies in minimum number of groups such than no group contains more than 3 candy. He crushes one candy from each group. If there are G groups in a single step, then the cost incurred in crushing a single candy for that step is G dollars. After candy from each group is crushed, he takes all the remaining candies and repeats the process until he has no candies left. He hasn't started crushing yet, but he wants to know how much total cost would be incurred. Can you help him?
You have to answer Q independent queries.

Input
The first line of input contains a single integer, Q denoting the number of queries.
Next Q lines contains a single integer N denoting the number of candies John has.

1 <= Q <= 5 * 10^4
1 <= N <= 10^9

Output
Print Q lines containing total cost incurred for each query.
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

	public static long cost(long n)
	{
		if(n==0)
		return 0;
		return no_of_groups(n)*no_of_groups(n) + cost(n - no_of_groups(n) );
	}

	public static long no_of_groups(long n)
	{
		long groups = n/3;
		if(n%3!=0)
		groups++;
		return groups;
	}

	public static void main (String[] args) {
    // Your code here
	Scanner sc = new Scanner(System.in);
	int Q = sc.nextInt();
	while(Q-- >0)
	{
		long N = sc.nextInt();
		System.out.println(cost(N));
	}
	}
}