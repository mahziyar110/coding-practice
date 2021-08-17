/*
Given a linked list consisting of N nodes, your task is to traverse the list and print its elements.

Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function printList() that takes head node of the linked list as parameter.

Constraints:
1 <=N <= 1000
1 <=Node.data<= 1000

Output
For each testcase you need to print the elements of the linked list separated by space. The driver code will take care of printing new line.
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
public static void printList(Node head) {
    while(head != null)
    {
        System.out.print(head.val + " ");
        head = head.next;
    }
}