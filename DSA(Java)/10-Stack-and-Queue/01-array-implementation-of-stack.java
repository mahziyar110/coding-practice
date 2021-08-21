/*
Your task is to implement a stack using an array and perform given queries

Note: Description of each query is given in the input and output format

Input
User task:
Since this will be a functional problem, you don't have to take input. You just have to complete the functions:
push():- that takes the integer to be added and the maximum size of the array as a parameter.
pop():- that takes no parameter.
top() :- that takes no parameter.

Constraints:
1 <= N(number of queries) <= 103

Output
During a pop operation if the stack is empty you need to print "Stack underflow",
during push operation, if the maximum size of the array is reached you need to print "Stack overflow",
during top operation, you need to print the element which is at the top
if the stack is empty you need to print "Empty stack".

Note:- Each message or element is to be printed on a new line
*/

/*
    int top=-1; // index of current top
    int a[] // array which contain element of stack 
*/
// function to add element in the stack
//x=element to be added
//size=maximum size of array
void push(int x,int size)
{
    //enter  your code here
    if(top == size-1)
    {
        System.out.println("Stack overflow");
        return;
    }
    top++;
    a[top] = x;
}

// Function to pop element from stack
 void pop()
{
   // enter your code here
   if(top == -1)
   {
       System.out.println("Stack underflow");
       return;
   }
   top--;
}

 void top()
{
    //enter your code here
    if(top == -1)
    {
        System.out.println("Empty stack");
        return;
    }
    System.out.println(a[top]);
}