/*
Linear probing is a collision handling technique in hashing. Linear probing says that whenever a collision occurs, search for the immediate next position.

In this question, we'll learn how to fill up the hash table using linear probing technique. You are given hash table size which you'll use to insert elements into their correct position in the hash table i.e.(arr[i]%hashSize). You are also given an array arr of size n. You need to fill up the hash table using linear probing and print the resultant hash table.

Note: All the positions that are unoccupied are denoted by -1 in the hash table.
If there is no more space to insert, then just drop that element.

Input
The first line of input contains T denoting the number of testcases. T testcases follow. Each testcase contains 2 lines of input. The first line contains size of the hashtable and size of array. The third line contains elements of the array.

Constraints:
1 <= T <= 100
1 <= hashSize <= 10^3
1 <= sizeOfArray <= 10^3
0 <= Array[] <= 10^5

Output
For each testcase, in a new line, print the hash table as shown in example.
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
            
            int count = 0;
            while(ht[index] != -1 && count<capacity)
            {
                index = (index+1)%capacity;
                count++;
            }
            if(count < capacity)
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