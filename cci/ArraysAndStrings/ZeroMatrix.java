package cci.ArraysAndStrings;

import java.util.HashSet;
import java.util.Set;

public class ZeroMatrix {

    public static void solution(int[][] mat, int m, int n)
    {
        Set<Integer> zeroedCols = new HashSet<Integer>();
        Set<Integer> zeroedRows = new HashSet<Integer>();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(mat[i][j]==0)
                {
                    zeroedRows.add(i);
                    zeroedCols.add(j);
                }
            }
        }
        for(Integer i : zeroedRows)
        {
            for(int j=0;j<n;j++)
                mat[i][j] = 0;
        }
        for(Integer i: zeroedCols)
        {
            for(int j=0;j<m;j++)
                mat[j][i] = 0;
        }
    }

    public static void printSolution(int[][] mat, int m, int n)
    {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("************************");
    }
    public static void main(String[] args) {
        
        int[][] mat = {{1,2,3},{4,0,6},{7,8,9}};
        printSolution(mat, 3, 3);
        solution(mat, 3, 3);
        printSolution(mat, 3, 3);
        int[][] mat1 = {{1,2,3,0},{4,0,6,12},{7,8,9,0},{11,22,34,50}};
        printSolution(mat1, 4, 4);
        solution(mat1, 4, 4);
        printSolution(mat1, 4, 4);
    }
    
}
