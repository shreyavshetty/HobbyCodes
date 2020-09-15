package cci.ArraysAndStrings;

import java.util.Scanner;

public class OneWay {

    public static boolean solution1(String s1, String s2) {
        int l1 = s1.length();
        int l2 = s2.length();
        if (Math.abs(l1 - l2) >= 2)
            return false;
        int i = 0;
        int j = 0;
        boolean edit = false;
        while (i < l1 && j < l2) {
            if (s1.charAt(i) != s2.charAt(j) && edit == false) {
                edit = true;
                if (i + 1 < l1 && s1.charAt(i + 1) == s2.charAt(j)) {

                    i++;
                } else if (j + 1 < l2 && s1.charAt(i) == s2.charAt(j + 1)) {
                    j++;
                } else {
                    i++;
                    j++;
                }
            } else if (s1.charAt(i) != s2.charAt(j) && edit == true)
            {
                return false;
            }
            else
            {
                i++;
                j++;
            }

        }
        if((i==l1 && j==l2 && edit==true) || (l1!=l2 && edit==false))
            return true;
        return false;
    }
    /*
        Generalized DP Problem
    */
    public static boolean solution2(String s1, String s2)
    {
        int l1 = s1.length();
        int l2 = s2.length();
        int[][] mat = new int[l1+1][l2+1];
        mat[0][0] = 0;
        for(int i=1;i<=l1;i++)
            mat[i][0] = i;
        for(int i=1;i<=l2;i++)
            mat[0][i] = i;
        for(int i=1;i<=l1;i++)
        {
            for(int j=1;j<=l2;j++)
            {
                if(s1.charAt(i-1) == s2.charAt(j-1))
                    mat[i][j] = mat[i-1][j-1];
                else
                    mat[i][j] = Math.min(mat[i][j-1], Math.min(mat[i-1][j-1], mat[i-1][j])) + 1;
            }
        }
        System.out.println("Edit distance : "+mat[l1][l2]);
        if(mat[l1][l2]==1)
            return true;
        return false;
        
    }
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            String s1 = inp.nextLine();
            String s2 = inp.nextLine();
            System.out.println(solution1(s1, s2));
            System.out.println(solution2(s1, s2));
           
        }
    }
    
}
