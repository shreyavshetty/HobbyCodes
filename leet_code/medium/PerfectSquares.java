/**
QuestionLink : https://leetcode.com/problems/perfect-squares
Time Complexity ~ O(n*sqrt(n)) 
Space Complexity = O(n)
**/
import java.util.*;

class Solution {
    public int numSquares(int n) {
        
        int[] dp = new int[n+1];
        if(n<=3)
        {
            return n;
        }
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        for(int i=4;i<=n;i++)
        {
            dp[i] = i;
            for(int j=1;j<i;j++)
            {
                if(j*j<=i)
                {
                    dp[i] = Math.min(dp[i], dp[i-j*j]+1);
                }
                else
                {
                    break;
                }
            }
        }
        return dp[n];
    }
}