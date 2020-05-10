/**
QuestionLink : https://leetcode.com/problems/regular-expression-matching/
Time Complexity = O(n*m) n- length of string m - length of pattern
Space Complexity = O(n*m)
**/
import java.util.*
class Solution {
    public boolean isMatch(String s, String p) {
        
        boolean[][] mat = new boolean[s.length()+1][p.length()+1];
        mat[0][0] = true;
        for(int j=1;j<=p.length();j++)
        {
            if(p.charAt(j-1) == '*')
            {
                mat[0][j] = mat[0][j-2] ;
            }
        }
        for(int i=1;i<=s.length();i++)
        {
            for(int j=1;j<=p.length();j++)
            {
                //System.out.println(i+" "+j);
                if(p.charAt(j-1) == s.charAt(i-1) || p.charAt(j-1)=='.')
                {
                    mat[i][j] = mat[i-1][j-1];
                }
                else if(p.charAt(j-1) == '*')
                {
                    //System.out.println("*");
                    mat[i][j] = mat[i][j-2];
                    //System.out.println( mat[i][j-2]);
                    if(p.charAt(j-2) == s.charAt(i-1) || p.charAt(j-2) == '.')
                    {
                        mat[i][j] = mat[i][j] || mat[i-1][j];
                       // System.out.println(mat[i][j-1]);
                    }
                }
                else
                {
                    mat[i][j] = false;
                }
                //System.out.println(mat[i][j]);
            }
            
        }
        // for(int i=0;i<=s.length();i++)
        // {
        //     for(int j=0;j<=p.length();j++)
        //     {
        //         System.out.print(mat[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        return mat[s.length()][p.length()];
        
    }
}