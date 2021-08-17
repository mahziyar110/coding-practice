/*
Given a circular linked list consisting of N nodes and an integer K, your task is to add the integer K at the end of the list.

Note:Examples in Sample Input and Output just shows how a linked list will look like depending on the questions. Do not copy-paste as it is in custom input

Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function Insertion() that takes head node of circular linked list and the integer K as parameter.

Constraints:
1 <=N <= 1000
1 <= Node.data, K<= 1000

Output
Return the head node of the modified circular linked list.
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

    public static Node Insertion(Node head, int K){
        //Enter your code here
        Node temp = head;
        while(temp.next != head)
        {
            temp = temp.next;
        }      
        temp.next = new Node(K);
        temp.next.next = head;
    
        return head;
        }