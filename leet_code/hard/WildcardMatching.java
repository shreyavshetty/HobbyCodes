/**
QuestionLink : https://leetcode.com/problems/valid-parentheses/
Time Complexity = O(m*n) n- length of string n-length of pattern
Space Complexity = O(m*n) n- length of string n-length of pattern
**/
import java.util.*
class Solution {
    public boolean isMatch(String s, String p) {
        if((s==null || s.length()==0) && (p==null || p.length()==0 || p.equals("*")))
        {
            return true;
        }
        if(s==null || s.length()==0 || p==null || p.length()==0)
        {
            return false;
        }
        boolean [][] mat = new boolean[s.length()+1][p.length()+1];
        mat[0][0] = true;
        for(int i=1;i<=p.length();i++)
        {
            if(p.charAt(i-1)=='*')
            {
                 mat[0][i] =  mat[0][i-1];
            }
            
        }
        for(int i=1;i<=s.length();i++)
        {
            for(int j=1;j<=p.length();j++)
            {
                if(p.charAt(j-1)=='?' || p.charAt(j-1)==s.charAt(i-1))
                {
                    mat[i][j] = mat[i-1][j-1];
                }
                else if(p.charAt(j-1)=='*')
                {
                    mat[i][j] = mat[i-1][j] || mat[i][j-1];
                }
                else
                {
                    mat[i][j] = false;
                }
            }
        }
        return mat[s.length()][p.length()];
        
    }
}