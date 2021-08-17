/*
Given a doubly linked list consisting of N nodes and two integers P and K. Your task is to add an element K at the Pth position from the start of the linked list

Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function insertnew(). The description of parameters are mentioned below:

head: head node of the double linked list
K: the element which you have to insert
P: the position at which you have insert

Constraints:
1 <= P <=N <= 1000
1 <=K, Node.data<= 1000

In the sample Input N, P and K are in the order as mentioned below:
N P K

Output
Return the head of the modified linked list.
*/

/*

class Node {
    Node next;
    Node prev;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
        prev = null;
    }
}
*/


public static Node insertnew(Node head,int K, int P) { 
    if(P == 1)
    {
        head.prev = new Node(K);
        head.prev.next = head;
        return head.prev;
    }
    
    Node temp = head;
    for(int i=1; i<P-1; i++)
    {
        temp = temp.next;
    }
    temp.next.prev = new Node(K);
    temp.next.prev.next = temp.next;
    temp.next.prev.prev = temp;
    temp.next = temp.next.prev;
    
    return head;
    
    }