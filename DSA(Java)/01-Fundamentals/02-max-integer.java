/*
Given three integers your task is to calculate the maximum integer among the given integers.

Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function MaxInteger() that takes three integers a,b and c as a parameter.

Constraint:
1<=integers<=10000

Output
Return the maximum integer among the given integers.
*/

static int  MaxInteger(int a ,int b, int c) {
    //Enter your code here
    int d=0;
    d=a;
    if(b>d)
        d=b;
    if(c>d)
        d=c;
    return d;
}