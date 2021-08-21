/*
Given a number N. The task is to generate and print all binary numbers with decimal values from 1 to N.

Try solving this using a queue.

Input
The only line of input contains a single integer N.

1 <= N <= 50000

Output
Print all binary numbers with decimal values from 1 to N in a single line.
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
    Queue<String> q = new LinkedList<>();

    String str = "1";
    q.add(str);

    for(int i=0; i<n; i++)
    {
        str = q.peek();
        q.add(str + "0");
        q.add(str + "1");

        System.out.print(q.remove() + " ");

    }
    
    
    }
}