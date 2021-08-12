/*
Sara is solving a math problem in which she has given an integer N and her task is to find the number of operations required to convert N into 1.
Where in one operation you replace the number with its second-highest divisor.

Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function DivisorProblem() that takes integer N as argument.

Constraints:-
1 <= N <= 100000

Output
Return the number of operations required.
*/

static int DivisorProblem(int N){
    //Enter your code here
    int count = 0;
    while(N!=1)
    {
      N = HighestDiv(N);
      count++;
    }
    
    return count;
    }
    
    public static int HighestDiv(int x)
    {
      int div = 0;
      for(int i=1; i<=(x/2); i++)
      {
        if(x%i == 0)
        div = i;
      }
      return div;
    }