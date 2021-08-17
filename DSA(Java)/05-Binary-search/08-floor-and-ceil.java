/*
Given a sorted array of N integers a[], and Q queries. For each query, you will be given one element K your task is to print the maximum element from the array which is less than or equal to the given element(Floor), and the minimum element from the array which is greater than or equal to the given element(Ceil).

Input
In case of Java only
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function floorAndCeil() that takes the array a[], integer N and integer k as arguments.

Custom Input
The first line of input contains a single integer N. The Second line of input contains N space-separated integers depicting the values of the array. The third line of input contains a single integer Q. The next Q line of input contains a single integer the value of K.

Constraints:-
1 <= N <= 100000
1 <= K, Arr[i] <= 1000000000000
1 <= Q <= 10000

Output
In a new line Print two space-separated integers depicting the values of Floor and Ceil of the given number. If the floor or ceil of the element does not exist print -1.
*/

static void floorAndCeil(int arr[], int N, int x){	
    //Enter your code here
    if(x < arr[0])
    {
        System.out.println("-1 " + arr[0]);
    }
    else if(x > arr[N-1])
    {
        System.out.println(arr[N-1] + " -1");
    }
    else
    {
        int low = 0;
        int high = N-1;
        int ans = 0;
        
        while(low <= high)
        {
            int mid = low + (high-low)/2;
            if(arr[mid] == x)
            {
                System.out.println(arr[mid] + " " + arr[mid]);
                return;
            }
            else if(arr[mid] > x)
            {
                high = mid - 1;
                ans = mid;
            }
            else
            {
                low = mid + 1;
            }
        }
        System.out.println(arr[ans-1] + " " + arr[ans]);
    }
    }