/*
Given an array A[] of size N containing positive integers. You need to arrange these elements in increasing order using Quick Sort algorithm.

Input
User Task:
Since this is a functional problem you don't have to worry about the input. You just have to complete the function quickSort() which contains following arguments.

A[]: input array
start: starting index of array
end: ending index of array

Constraints
1 <= T <= 1000
1 <= N <= 10^4
1 <= A[i] <= 10^5

Sum of "N" over all testcases does not exceed 10^5

Output
For each testcase you need to return the sorted array. The driver code will do the rest.
*/

/*
// Information about the arguments given in function
arr[]: input array
start: starting index of array
end: ending index of array
*/
public static int partition(int arr[], int start, int end){
    int pivot = arr[end];
    int i = start - 1;
    
    for(int j = start; j < end ; j++){
        if(arr[j] < pivot){
            i++;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    int temp = arr[i+1];
    arr[i+1] = arr[end];
    arr[end] = temp;

    return i+1;
}


public static int[] quickSort(int arr[], int start, int end)
{       
        if(start < end)
        {
            int p = partition(arr, start, end); 
            quickSort(arr, start, p-1);
            quickSort(arr, p+1, end);
        }
        return arr;
}