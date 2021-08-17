/*
A conveyor belt has parcels that must be shipped from one point to another within D days.

The i-th parcel on the conveyor belt has a weight of weights[i]. Each day, we load the ship with parcels on the conveyor belt (in the order given). We may not load more weight than the maximum weight capacity of the ship.

Return the least weight capacity of the ship that will result in all the parcels on the conveyor belt being shipped within D days.

Input
The input line contains T, denoting the number of testcases. Each testcase contains two lines. First line N ,contains size of the conveyor belt and D days separated by space. Second line contains weights of parcels.

Constraints:
1 <= T <= 100
1 <= D <= N <= 5*10^4
1 <= weights[i] <= 500
Sum if N over all test cases is <= 1000000

Output
For each testcase you need to print the least weight capacity of the ship that will result in all the parcels on the conveyor belt being shipped within D days.
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) throws IOException {
    // Your code here
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine().trim());

    while(t-- > 0)
	{
    	String str[] = br.readLine().trim().split(" ");
    	int n = Integer.parseInt(str[0]);
    	int d = Integer.parseInt(str[1]);

	    int arr[] = new int[n];
	    str = br.readLine().trim().split(" ");
		int max = 0, sum = 0;
	    for(int i = 0; i < n; i++)
		{
	    	arr[i] = Integer.parseInt(str[i]);
			sum += arr[i];
			if(arr[i]>max)
			max = arr[i];
	    }

        System.out.println(binarySearch(arr, n, d, max, sum));
    }
}

	public static int binarySearch(int[] arr, int n, int d, int max, int sum)
	{
        int low = max;
        int high = sum;

        while(low < high){
            int mid = low + (high - low) / 2;
            if(count(arr, n, mid) > d){
                low = mid + 1;
            }
            else{
                high = mid;
            }
        }
        return high;
    }

    public static int count(int arr[], int n, int w){
        int days = 1, sum = 0;
		for(int i=0; i<n; i++)
		{
			if((sum+arr[i]) <= w)
			{
				sum += arr[i];
			}
			else
			{
				days++;
				sum = arr[i];
			}
		}
        return days;
    }	
	
}