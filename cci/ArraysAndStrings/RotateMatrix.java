package cci.ArraysAndStrings;

public class RotateMatrix {
    public static void solution(int[][] mat, int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i ; j++) {
                int tmp = mat[i][j];
                mat[i][j] = mat[n - j - 1][n - i - 1]; 
                mat[n - j - 1][n - i - 1] = tmp; 
            }
        }
        printMatrix(mat, n);
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n/2 ; i++) {
                int tmp = mat[i][j];
                mat[i][j] = mat[n - i - 1][j];
                mat[n - i - 1][j] = tmp;
            }
        }
    }

    public static void printMatrix(int[][] mat, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("************************");
    }

    public static void main(String[] args) {

        int[][] mat = new int[4][4];
        int[][] mat1 = new int[5][5];
        int count = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                mat[i][j] = count;
                count++;
            }
        }
        count = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                mat1[i][j] = count;
                count++;
            }
        }
        printMatrix(mat1, 5);
        solution(mat1, 5);
        printMatrix(mat1, 5);
        
    }
}
