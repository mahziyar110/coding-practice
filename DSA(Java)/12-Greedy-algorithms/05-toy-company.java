/*
Priyanka works for an international toy company that ships by container. Her task is to the determine the lowest cost way to combine her orders for shipping. She has a list of item weights. The shipping company has a requirement that all items loaded in a container must weigh less than or equal to 4 units plus the weight of the minimum weight item. All items meeting that requirement will be shipped in one container.

What is the smallest number of containers that can be contracted to ship the items based on the given list of weights?

See example for better understanding.

Input
The first line contains an integer N, the number of orders to ship.
The next line contains N space- separated integers, w[1], w[2]., w[N] representing the orders in a weight array.

1 <= N <= 100000
1 <= w[i] <= 100000

Output
Print the integer value of the number of containers Priyanka must contract to ship all of the toys.
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
	Arrays.sort(arr);
	int count = 1;
	int limit = arr[0]+4;
	for(int i=0; i<n; i++)
	{
		if(arr[i] > limit)
		{
			count++;
			limit = arr[i] + 4;
		}
	}
	System.out.println(count);
	
	
	}
}