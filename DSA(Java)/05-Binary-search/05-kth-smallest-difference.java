/*
You are given an array of integers. Consider absolute difference between all the pairs of the the elements. You need to find Kth smallest absolute difference. If the size of the array is N then value of K will be less than N and more than or equal to 1.

Input
The first line of input contains number of test cases T.
The first line of each test case contains a two integers N and K denoting the number of elements in the array A and difference you need to output. The second line of each test case contains N space separated integers denoting the elements of the array A

Constraints:
1<= T <= 10
2 <= N <= 100000
1 <= K < N < 100000
0 <= A[i] <= 100000

Output
For each test case, output Kth smallest absolute difference.
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) throws IOException{
        // Your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while(t-- > 0){
        String str[] = br.readLine().trim().split(" ");
        int n = Integer.parseInt(str[0]);
        int k = Integer.parseInt(str[1]);

        int arr[] = new int[n];
        str = br.readLine().trim().split(" ");
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(str[i]);
            }

                System.out.println(binarySearch(arr, n, k));
            }
    }

    public static int binarySearch(int[] arr, int n, int k){
        Arrays.sort(arr);
        int left = 0;
        int right = arr[n-1] - arr[0];

        while(left < right){
            int mid = left + (right - left) / 2;
            if(count(arr, n, mid) < k){
                left = mid + 1;
            }
            else{
                right = mid;
            }
        }
        return right;
    }

    public static int count(int arr[], int n, int diff){
        int result = 0, j = 0;
        for(int i = 1; i < n; i++){
            while(j < i && arr[i] - arr[j] > diff){
                j++;
            }
            result += i-j;
        }
        return result;
    }

}