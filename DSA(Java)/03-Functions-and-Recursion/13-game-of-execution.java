/*
To seek revenge on Midgard, Loki devises a plan to torture the humans by making them take part in one of his silly games. He makes N people sit in a circle. He says he will kill every kth person sitting in the circle, starting from 1st person.
Loki performs his revenge prank until and unless 1 survivor remains.
What is the initial position of the survivor, if the indexing is clockwise?

Input
The first line of input contains a single integer T. The next T line of input contains Two space separated integers each containing value of N and k.


Constraints:
1 <= T <= 100
1 <= k, N <= 20

Output
Print the initial position of the survivor.
*/

public static int safe_Position(int n, int k)
{
      // Your code here
      if(n==1)
      return 1;
      else return ((safe_Position(n-1,k)+k-1)%n +1);
}