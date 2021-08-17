/*
Given two sorted linked list, your task is to merge them such that resultant list is also sorted.

Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function Merge() that takes head node of both the linked list as the parameter.

Constraints:
1 < = N (Size of lists) < = 1000
1 < = Node.data < = 10000

Output
Return the head of the merged linked list, printing will be done by the driver code
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
/*
below function is used to insert nodes in the linked list
public static Node insert111(Node head, int val) {
        if(head == null) {
            return new Node(val);
        } else {
            Node cur;
            cur = insert111(head.next, val);
            head.next = cur;
            return head;
        }
    }

*/
public static Node Merge (Node head1, Node head2){
    //Enter your code here
    Node temp = null;
    
    while(head1 != null && head2 != null)
    {
        if(head1.val > head2.val)
        {
            temp = insert111(temp, head2.val);
            head2 = head2.next;
        }
        else
        {
            temp = insert111(temp, head1.val);
            head1 = head1.next;
        }
    }
    while(head1 != null)
    {
        temp = insert111(temp, head1.val);
        head1 = head1.next;
    }
    while(head2 != null)
    {
        temp = insert111(temp, head2.val);
        head2 = head2.next;
    }
    
    return temp;
    
    
    }