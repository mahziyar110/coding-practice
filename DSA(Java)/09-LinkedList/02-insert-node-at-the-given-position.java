/*
Given a linked list consisting of N nodes and two integers M and K. Your task is to add element K at the Mth position from the start of the linked list

Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function addElement() that takes head node, M(position of element to be inserted) and K(the element to be inserted) as parameter.

Constraints:
1 <= M <=N <= 1000
1 <=K, Node.data<= 1000

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

public static Node addElement(Node head, int k ,int pos ) {
    //enter your code here
    if(pos == 1)
    {
        Node temp = new Node(k);
        temp.next = head;
        return temp;
    }
    Node ptr = head;
    for(int i=1; i<pos-1; i++)
    {
        ptr = ptr.next;
    }
    Node temp = new Node(k);
    temp.next = ptr.next;
    ptr.next = temp;
    
    return head;
    }