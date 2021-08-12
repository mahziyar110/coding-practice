/*
Sara wants to become a pokemon master so she invented a strategy to choose only one type of pokemon which has very high attack power and very weak defense. i. e in a fight with this type of pokemon whoever attacks first will win. A pokemon battle goes in turns(i. e at each turn one player will attack) and Sara always goes first. Given the number of pokemon of Sara and his opponent as A and B, your task is to tell whether Sara is going to win or not.

Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function PokemonMaster() that takes integers A and B as arguments.

Constraints:-
1 <= A, B <= 8

Output
Return 1 if Sara is going to win else return 0.
*/

static int PokemonMaster(int A, int B){
    //Enter your code here
    if(A>=B)
    return 1;
    else return 0;
}