/*
Given an array A of positive integers. Your task is to sort them in such a way that the first part of the array contains odd numbers sorted in descending order, rest portion contains even numbers sorted in ascending order.

Input
First line of each test case contains an integer N denoting the size of the array. The next line contains N space separated values of the array.

1 <= N <= 100000
0 <= A[i] <= 100000

Output
Print the space separated values of the modified array.
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
  // Your code here
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();

  int arr[] = new int[n];
  int count = 0;
  for(int i=0; i<n; i++)
  {
    arr[i] = sc.nextInt();
    if(arr[i]%2 != 0)
    count++;
  }
  int odd[] = new int[count];
  int even[] = new int[(n-count)];

  int j=0, k=0;
  for(int i=0; i<n; i++)
  {
    if(arr[i]%2 != 0)
    {
      odd[j] = arr[i];
      j++;
    }
    else
    {
      even[k] = arr[i];
      k++;
    }
  }

  Arrays.sort(odd);
  Arrays.sort(even);

  j=count-1;
  for(int i=0; i<count; i++)
  {
    arr[i] = odd[j];
    j--;
  }

  j=0;
  for(int i=count; i<n; i++)
  {
    arr[i] = even[j];
    j++;
  }

  for(int i=0; i<n; i++)
  {
    System.out.print(arr[i] + " ");
  }
	}
}