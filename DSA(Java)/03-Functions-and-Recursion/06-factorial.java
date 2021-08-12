/*
Find factorial of a given number N.

Input
User Task
Since this is a functional problem, you don't have to worry about the input. You just have to complete the function Factorial() which contains the given number N.

Constraints:
1 <= N <= 15

Output
Return the factorial of the given number.
*/

static int Factorial(int N){
    //Enter your code here
    if(N==1)
    return 1;
    return N*Factorial(N-1);
}