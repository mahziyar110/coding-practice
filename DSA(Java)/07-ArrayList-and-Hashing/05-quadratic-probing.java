/*
Quadratic probing is a collision handling technique in hashing. Quadratic probing says that whenever a collision occurs, search for i^2 position.

In this question, we'll learn how to fill up the hash table using Quadratic probing technique. You are given hash table size which you'll use to insert elements into their correct position in the hash table i.e.(arr[i]%hashSize). You are also given an array arr[] of size N. You need to fill up the hash table using Quadratic probing and print the resultant hash table.

Note:

1. All the positions that are unoccupied are denoted by -1 in the hash table.
2. An empty slot can only be found if load factor < 0.5 and hash table size is a prime number.
3. The given testcases satisfy the above condition so you can assume that an empty slot is always reachable.

Input
The first line of input contains T denoting the number of testcases. T testcases follow. Each testcase contains 2 lines of input. The first line contains size of the hashtable and size of array. The third line contains elements of the array.

Constraints:
1 <= T <= 100
2 <= hashSize (prime) <= 97
1 <= sizeOfArray < hashSize*0.5
0 <= Array[i] <= 10^5

Output
For each testcase, in a new line, print the hash table.
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
    // Your code here
	Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while(t-- > 0)
    {
        int capacity = sc.nextInt();
        int n = sc.nextInt();
        int ht[] = new int[capacity];
        Arrays.fill(ht, -1);

        for(int i=0; i<n; i++)
        {
            int key = sc.nextInt();
            int index = key%capacity;
            
            if(ht[index] != -1)
            {
				for(int j=1; j<capacity; j++)
				{
					int temp = (index+(j*j))%capacity;
					if(ht[temp] == -1)
					{
						ht[temp] = key;
						break;
					}
				}               
            }
            else
			{
				ht[index] = key;
			}
        }

        for(int i=0; i<capacity; i++)
        {
            System.out.print(ht[i] + " ");
        }
        System.out.println();
    }
    
    
    }
}