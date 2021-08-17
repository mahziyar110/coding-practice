/*
Given a linked list consisting of N nodes and an integer K, your task is to delete the Kth node from the end of the linked list

Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function deleteElement() that takes head node and K as parameter.

Constraints:
1 <=K<=N<= 1000
1 <=Node.data<= 1000

Output
Return the head of the modified linked list
*/

/*
class Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
    }
}
*/

public static Node deleteElement(Node head,int posEnd) {
    //enter your code here
    int length = 0;
    Node temp = head;
    while(temp != null)
    {
        length++;
        temp = temp.next;
    }
    
    int posStart = length - posEnd;
    
    if(posStart == 0)
    {
        head = head.next;
        return head;
    }
    
    temp = head;
    int i=1;
    while(i < posStart)
    {
        temp = temp.next;
        i++;
    }
    
    temp.next = temp.next.next;
    
    return head;
    }