/*
Given an arraylist of integers. The task is to perform operations on ArrayList according to the queries and print output for the required queries.

Note: use Collections.sort() to sort the list in natural order, Collections.reverseOrder() to arrange the elements in reverse, get() to return the element at index of the list, linear search for finding specified element in the list. If multiple positions exist, print the smallest one.

Input
User Task:
Since this is a functional problem, you don’t have to worry about the input, you just have to complete the functions:-
insert() That takes the arraylist and the integer to be inserted as a parameter
IncOrder() That takes the arraylist as a parameter.
Search()That takes the arraylist and the integer to be find as a parameter.
DecOrder() That takes arraylist as a parameter.

Constraints:-
1 < = N < = 1000
1 < = Arr[i] < = 100000

Output
Print the index of element if found else print -1 in Search function add a white-space after every output.
*/

// Function to insert element into list
public static void insert(ArrayList<Integer> list, int x)
{
    // Your code here
    list.add(x);
}

// Function to sort list in Increasing order
public static void IncOrder(ArrayList<Integer> list)
{
    // Your code here
    Collections.sort(list);
}

// Function to search element in the lise
// val : element to be searched
public static void Search(ArrayList<Integer> list, int val)
{
    // Your code here
    int result = -1;
    for(int i=0; i<list.size(); i++)
    {
        if(list.get(i) == val)
        {
            result = i;
            break;
        }
    }
    System.out.print(result + " ");
    
}

// Function to sort list in decreasing order
public static void DecOrder(ArrayList<Integer> list)
{
   // Your code here
   Collections.sort(list, Collections.reverseOrder());
}