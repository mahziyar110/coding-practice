/*
Given a sorted array of N integers a[], and Q queries. For each query, you will be given one element K your task is to print the number of elements that are smaller than or equal to K.

Input
In case of Java only
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function smallerElements() that takes the array a[], integer N and integer k as arguments.

Custom Input
The first line of input contains a single integer N. The Second line of input contains N space- separated integers depicting the values of the array. The third line of input contains a single integer Q. The next Q line of input contains a single integer the value of K.

Constraints:-
1 <= N <= 100000
1 <= K, Arr[i] <= 1000000000000
1 <= Q <= 10000

Output
Return the count of elements smaller than or equal to K.
*/

static int smallerElements(int a[], int n, int k){
    //Enter your code here
    
    int low = 0;
    int high = n-1;
    int index = -1;
    while(low <= high)
    {
        int mid = low + (high-low)/2;
        if(a[mid] == k)
        {
            index = mid;
            low = mid + 1;
        }
        else if(a[mid] > k)
        {
            high = mid - 1;
        }
        else
        {
            low = mid + 1;
            index = mid;
        }
    }
    return (index+1);
}