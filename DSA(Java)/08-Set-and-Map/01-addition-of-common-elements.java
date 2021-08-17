/*
Morgan was opening some boxes when she found one bearing a message “For Morgan, Dad loves you 3000". She wants to open the box but she needs to solve the question to open it. She asks Peter to do that. Help Peter and Morgan solve the question so that they can see what's inside the box.

Given two arrays Arr1 and Arr2 of size N1 and N2. Your task is to find the sum of all elements that are common to both arrays. If there are no common elements the output would be 0.

Note: The arrays may contain duplicate elements. However, you need to sum only unique elements that are common to both arrays.

Input
The first line of input contains N1 and N2 separated by a space. The second line contains N1 space separated elements of Arr1. The third line contains N2 space separated elements of Arr2.

Constraints:
1 <= N1, N2 <= 106
1 <= Arr1[i], Arr2[i] <= 1000000000

Output
Print the sum of common elements.
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
	int m = sc.nextInt();
	int sum = 0;
	HashSet<Integer> hm1 = new HashSet<>();
	HashSet<Integer> hm2 = new HashSet<>();
	for(int i=0; i<n; i++)
	{
		hm1.add(sc.nextInt());
	}
	
	for(int i=0; i<n; i++)
	{
		hm2.add(sc.nextInt());
	}
	
	for(int temp : hm2)
	{
		if(hm1.contains(temp))
		{
			sum += temp;
		}
	}
	System.out.println(sum);
	
	
	}
}