/*
Given an array A[] of size N, containing positive integers. You need to print the sum and mean (floor value) of given numbers.

Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function:- SumAndMean() that takes the Array and the integer N as parameter.

Constraints:-
1 <= N <= 100
1 <= A[i] <= 100

Output
Print the Sum and the Mean of the array separated by a space.
*/

static void SumAndMean(int arr[],int N){
    //Enter your code here
    int sum = 0;
    for(int i=0; i<N; i++)
    {
      sum+=arr[i];
    }
    System.out.println(sum + " " + (sum/N));
}