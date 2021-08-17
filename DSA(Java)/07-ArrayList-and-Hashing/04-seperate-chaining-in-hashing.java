/*
Separate chaining technique in hashing allows us to use a linked list at each hash slot to handle the problem of collisions. That is, every slot of the hash table is a linked list, so whenever a collision occurs, the element can be appened as a node to the linked list at the slot.

In this question, we'll learn how to fill up the hash table using Separate chaining technique. You are given hash table size which you'll use to insert elements into their correct position in the hash table i.e.(arr[i]%hashSize). You are also given an array arr. The size of the array is denoted by sizeOfArray. You need to fill up the hash table using Separate chaining and print the resultant hash table.

Input
The first line of input contains T denoting the number of testcases. T testcases follow. Each testcase contains 2 lines of input. The first line contains size of the hashtable and the size of the array. The next line contains elements of the array

Constraints:
1 <= T <= 100
2 <= hashSize <= 10^3
1 <= sizeOfArray <= 10^3
0 <= arr[i] <= 10^7

Output
For each testcase, in a new line, print the hash table. You need to print the hash table as represented in the example.

Note: Please print tilde ( '~') character at the end of every testcase for separation of list from one another. Given below in the example represent to how to separate each testcase by tilde character.
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
        int size = sc.nextInt();

        ArrayList<Integer> list[] = new ArrayList[capacity];

        for(int i=0; i<size; i++)
        {
            int key = sc.nextInt();
            int index = key%capacity;

            if(list[index] == null)
            {
                list[index] = new ArrayList<Integer>();
                list[index].add(key);
            }
            else
            {
                list[index].add(key);
            }
        }

        for(int i=0; i<capacity; i++)
        {
            if(list[i] != null)
            {
                System.out.print(i);
                ArrayList<Integer> temp = list[i];
                for(int j=0; j<temp.size(); j++)
                {
                    System.out.print("->" + temp.get(j));
                }
                System.out.println();
            }
        }
        System.out.println("~");
    }
    
    
    }
}