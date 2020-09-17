package cci.ArraysAndStrings;

import java.util.HashSet;
import java.util.Set;

public class ZeroMatrix {

    public static void solution2(int[][] mat, int m, int n)
    {
        boolean rowIsZero = false;
        boolean colIsZero = false;
        for(int i=0;i<n;i++)
        {
            if(mat[0][i]==0)
                rowIsZero = true;
        }
        for(int i=0;i<m;i++)
        {
            if(mat[i][0]==0)
                colIsZero = true;
        }
        for(int i=1;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                if(mat[i][j]==0)
                {
                    mat[0][j] = 0;
                    mat[i][0] = 0;
                }
            }
        }

        for(int i=1;i<n;i++)
        {
            if(mat[0][i]==0)
            {
                for(int j=0;j<m;j++)
                {
                    mat[j][i] = 0;
                }
            }
        }

        for(int i=1;i<m;i++)
        {
            if(mat[i][0]==0)
            {
                for(int j=0;j<n;j++)
                {
                    mat[i][j] = 0;
                }
            }
        }

        if(rowIsZero)
        {
            for(int i=0;i<n;i++)
            {
                mat[0][i] = 0;
            }
        }
        if(colIsZero)
        {
            for(int i=0;i<m;i++)
            {
                mat[i][0] = 0;
            }
        }

    }
    public static void solution1(int[][] mat, int m, int n)
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
        System.out.println("********************");
    }
    public static void main(String[] args) {
        
        int[][] mat = {{1,2,3},{4,0,6},{7,8,9}};
        printSolution(mat, 3, 3);
        solution1(mat, 3, 3);
        printSolution(mat, 3, 3);
        int [][] mat2 = {{1,2,3},{4,0,6},{7,8,9}};
        solution2(mat2, 3,3);
        printSolution(mat2, 3, 3);
        int[][] mat1 = {{1,2,3,0},{4,0,6,12},{7,8,9,0},{11,22,34,50}};
        printSolution(mat1, 4, 4);
        solution1(mat1, 4, 4);
        printSolution(mat1, 4, 4);
        int[][] mat12 = {{1,2,3,0},{4,0,6,12},{7,8,9,0},{11,22,34,50}};
        solution2(mat12, 4, 4);
        printSolution(mat12, 4, 4);
    }
    
}
