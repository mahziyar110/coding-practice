/*
You are given a Singly linked list and an integer K. Your task is to insert the integer K at the head of the given linked list

Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function addElement() that takes head node and the element K as a parameter.


Constraints:
1 <=N<= 1000
1 <=K, value<= 1000

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

public static Node addElement(Node head, int k) {
    //enter your code here
    Node temp = new Node(k);
    temp.next = head;
    return temp;
    }