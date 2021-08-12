/*
Given an unsorted array, your task is to sort the array using merge sort.

Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function implementMergeSort() that takes 3 arguments.
arr: input array
start: starting index which is 0
end: ending index of array

Constraints
1 <= T <= 100
1 <= N <= 10^4
1 <= Arr[i] <= 10^5

Sum of 'N' over all test cases does not exceed 10^6

Output
You need to return the sorted array. The driver code will print the array in sorted form.
*/

public static int[] implementMergeSort(int arr[], int start, int end)
    {
        // Your code here
       // You can have your own function where you will use 
      // start and end position for divide purpose  
      mergesort(arr, start, end);
      return arr;
    }

public static void mergesort(int a[], int start, int end)
{
    if(start<end)
    {
        int mid = start + (end-start)/2;
        mergesort(a, start, mid);
        mergesort(a, mid+1, end);
        merge(a, start, mid, end);
    }
}

public static void merge(int a[], int start, int mid, int end)
{
    int left[] = Arrays.copyOfRange(a, start, mid+1);
    int right[] = Arrays.copyOfRange(a, mid+1, end+1);

    int i=0, j=0, k=start;

    while( i<left.length && j<right.length)
    {
        if(left[i] <= right[j])
        {
            a[k] = left[i];
            k++;
            i++;
        }
        else
        {
            a[k] = right[j];
            k++;
            j++;
        }
    }

    while(i<left.length)
    {
        a[k] = left[i];
        k++;
        i++;
    }

    while(j<right.length)
    {
        a[k] = right[j];
        k++;
        j++;
    }
}