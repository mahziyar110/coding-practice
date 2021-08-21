/*
Your school has N students, and each student has a strength denoted by an integer. You have to make a team by picking some students such that gcd of strengths of those students is not 1, otherwise they tend to fight all the time, and there wil be no team spirit .
What is the maximum number of students you can pick ?

Input
The input consists of two lines.
The first line contains an integer n, the number of Students in the school
The next line contains n space separated integers, where the i-th of them denotes s[i], the strength of the i-th Student.

Constraints:-
1<=n<=10^5
1<=s<=10^5

Output
Print single integer — the maximum number of Students you can take.
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void insert(HashMap<Integer, Integer> hm, int key)
	{
		if(hm.containsKey(key))
		{
			hm.put(key, hm.get(key)+1);
			return;
		}
		hm.put(key, 1);
	}

	public static void main (String[] args) {
    // Your code here
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	HashMap<Integer, Integer> hm = new HashMap<>();
	int max_stu = 0;

	for(int i=0; i<n; i++)
	{
		int key = sc.nextInt();
		insert(hm, key);
		max_stu = Math.max(max_stu, hm.get(key));

		int sqrt = (int)Math.sqrt(key);
		for(int j=2; j<=sqrt; j++)
		{
			if(key%j == 0)
			{
				insert(hm, j);
				max_stu = Math.max(max_stu, hm.get(j));
				if(j*j != key)
				{
					insert(hm, key/j);
					max_stu = Math.max(max_stu, hm.get(key/j));
				}
			}
		}
	}
	System.out.println(max_stu);
	
	}
}