/*
Given an integer K and a queue of integers, your task is to reverse the order of the first K elements of the queue, leaving the other elements in the same relative order.

Input
User task:
Since this will be a functional problem, you don't have to take input. You just have to complete the functions:
ReverseK():- that takes the Queue and the integer K as parameter.

Constraints:
1<=K<=N<=10000
1<=elements<=10000

Output
You need to return the modified Queue.
*/

static Queue<Integer> ReverseK(Queue<Integer> queue, int k) { 
    //enter your code here
    int n = queue.size();
    Stack<Integer> st = new Stack<>();
    for(int i=0; i<k; i++)
    {
        st.push(queue.poll());
    }
    while(!st.empty())
    {
        queue.add(st.pop());
    }
    for(int i=0; i<(n-k); i++)
    {
        queue.add(queue.poll());
    }
    return queue;
}