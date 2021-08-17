/*
Given a Doubly linked list consisting of N nodes and given a number K. The task is to delete the Kth node from the end of the linked list.

Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function deleteElement() that takes head node and the position K as parameter.

Constraints:
1 <=K<=N<= 1000
1 <=value<= 1000

Output
Return the head of the modified Doubly linked list
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
public static Node deleteElement(Node head,int k) {
    //enter your code here
    Node last = head;
    int length = 1;
    while(last.next != null)
    {
        last = last.next;
        length++;
    }
    
    if(length == k)
    {
        head.next.prev = null;
        return head.next;
    }
    if(k == 1)
    {
        last.prev.next = null;
        return head;
    }
    
    for(int i=1; i<k; i++)
    {
        last = last.prev;
    }
    last.prev.next = last.next;
    last.next.prev = last.prev;
    
    return head;
    }