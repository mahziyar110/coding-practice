/*
Given a queue of integers and N queries. Your the task is to perform these operations:-
enqueue:-this operation will add an element to your current queue.
dequeue:-this operation will delete the element from the starting of the queue
displayfront:-this operation will print the element presented at front

Note:-if queue is empty than dequeue operation will do nothing, and 0 will be printed as a front element of queue if it is empty.

Input
User task:
Since this will be a functional problem, you don't have to take input. You just have to complete the functions:
enqueue():- that takes integer to be added as a parameter.
dequeue():- that takes no parameter.
displayfront() :- that takes no parameter.

Constraints:
1 <= N(Number of queries) <= 103

Output
You don't need to print anything else other than in displayfront() in which you require to print the element at front of your queue in a new line, if the queue is empty you just need to print 0.
*/

class Queue
{
 private Node front, rear; 
 private int currentSize;
 
class Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
       
    }
}
    
 public Queue()
 {
 front = null;
 rear = null;
 currentSize = 0;
 }
 
 
 public void dequeue()
 {
//enter your code here
    if(front == null)
    {
        return;
    }
    front = front.next;
 }
 

 public void enqueue(int data)
 {
 //enter your code here
  if(front == null)
  {
      front = rear = new Node(data);
      return;
  }
  rear.next = new Node(data);
  rear = rear.next;
 }
 
 public void displayfront(){
     //enter your code here
    if(front == null)
    {
        System.out.println(0);
        return;
    }
    System.out.println(front.val);
 }
}