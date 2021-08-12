/*
Sherlock is a great detective but he is weak in maths. On one day Sherlock wants to divide N apples into M people but he is not sure whether he can divide them equally or not. Your task is to help Sherlock to solve the problem.

Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function Help() that takes integers N and M as arguments.

Constraints:-
1 <= N M <= 1000

Output
Return 1 if it is possible to divide N apple among M people else return 0.
*/

static int Help(int N, int M){
    //Enter your code here
    if(N%M == 0)
    return 1;
    return 0;
}