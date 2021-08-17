/*
Given a double linked list with consisting of N nodes, your task is to reverse the linked list and return the head of the modified list.

Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function Reverse() that takes head node of the linked list as a parameter.


Constraints:
1 <= N <= 10^3
1<=value<=100

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
public static Node Reverse(Node head) {
    //complete this function
    do
    {
      Node temp = head.next;
      head.next = head.prev;
      head.prev = temp;
    
      if(head.prev != null)
      {
        head = head.prev;
      }
    }while((head.prev != null));
    
    return head;
    }