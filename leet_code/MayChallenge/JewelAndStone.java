/**
QuestionLink : https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/534/week-1-may-1st-may-7th/3317/
Time Complexity = O(n*m) n- length of string
Space Complexity = O(n*m)
**/
import java.util.*;


class JewelAndStone{
    public int numJewelsInStones(String J, String S) {
        
        if(J==null || J.length()==0 || S==null || S.length()==0)
        {
            return 0;
        }
        boolean[] jewels = new boolean[256];
        for(int i=0;i<J.length();i++)
        {
            jewels[J.charAt(i)] = true;
        }
        int count = 0;
        for(int i=0;i<S.length();i++)
        {
            if(jewels[S.charAt(i)])
            {
                count++;
            }
        }
        return count;
    }
}