/*
Given a boolean Matrix of size N*M, A cell of the matrix is called "Good" if it is completely surrounded by the cells containing '1' i.e. each adjacent cell (which shares a common edge) contains '1'. Your task is to find the number of such cells.

See the below example for a better understanding

Input
First line of input contains two space- separated integers N and M. Next N lines of input contain M space- separated integers depicting the values of the matrix.

Constraints:-
3 <= N, M <= 500
0 <= Matrix[][] <= 1

Output
Print the number of good cells.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int matrix[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int cnt = 0;

        for(int i = 1; i < n - 1; i++){
            for(int j = 1; j < m - 1; j++){
                if(
                    matrix[i-1][j] == 1 &&
                    matrix[i+1][j] == 1 &&
                    matrix[i][j-1] == 1 &&
                    matrix[i][j+1] == 1){
                        cnt++;
                    }

            }
        }
        System.out.print(cnt);
    }

}