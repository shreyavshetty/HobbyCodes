/**
QuestionLink : https://leetcode.com/problems/gas-station/
Time Complexity = O(n*n) n- length of string

**/
import java.util.*;
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int i = 0;
        int n = gas.length;
        int currVal = 0;
        while(i<n)
        {
            currVal = 0;
            int j = i;
            currVal = gas[j]-cost[j];
            j = (j+1)%n;
            while(j!=i)
            {
                if(currVal < 0)
                {
                    break;
                }              
                currVal = currVal + gas[j]-cost[j];
                j = (j+1)%n;
                
            }
            if(i==j && currVal>=0)
            {
                return i;
            }
            i++;
        }
        return -1;
        
        
        
    }
}