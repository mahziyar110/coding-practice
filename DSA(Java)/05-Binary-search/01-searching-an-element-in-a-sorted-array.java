/*
Given a sorted array arr[] of N integers and a number K is given. The task is to check if the element K is present in the array or not.

Note: Use binary search to solve the problem

Input
The first line of input contains a number of test cases T. For each test case, first line of input contains a number of elements in the array, and the number K separated by space. The next line contains N elements.

Constraints:
1 <= T <= 10
1 <= N <= 100000
1 <= K <= 1000000000
1 <= arr[i] <= 1000000000

Sum of N over all test cases doesn't exceed 106

Output
For each testcase, if the element is present in the array print "1" (without quotes), else print "-1" (without quotes).
*/

static int isPresent(long arr[], int n, long k)
{
	    // Your code here
		int result = -1;
		int start = 0, end = n-1;
		
		while(start <= end)
		{
			int mid = start + (end-start)/2;
			if(arr[mid] == k)
			{
				result = 1;
				break;
			}
			else if(arr[mid] < k)
			{
				start = mid + 1;
			}
			else end = mid - 1;
		}

		return result;
}