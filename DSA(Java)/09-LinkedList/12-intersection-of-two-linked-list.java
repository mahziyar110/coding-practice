/*
Given two linked lists containing a point of intersection your task is to find that node.

Note:- It is guaranteed that the intersecting node will neither the head nor the last node of any linked list.

Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function intersection() that takes the head node of both the lists as a parameter.

Note: In the input, the entire linked list will be given.
First-line will consist of the size of linked lists which are joined together.
The last 3 lines will consist of elements of the corresponding linked list

Constraints:
1 < = Number of elements in linked list < = 1000
1 < = value < = 1000

Output
Return the node of intersection
*/

public static Node intersection(Node head1,Node head2){
    //Enter your code here
    Node temp = head1;
    HashSet<Node> hs = new HashSet<>();
    while(temp != null)
    {
        hs.add(temp);
        temp = temp.next;
    } 
    temp = head2;
    while(!hs.contains(temp))
    {
        temp = temp.next;
    }
    return temp;
    }