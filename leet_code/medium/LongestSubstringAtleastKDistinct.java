/**
QuestionLink : https://leetcode.com/problems/number-of-islands
Time Complexity = O(n) n- length of string
Space Complexity = O(m) m - distinct characters
**/
import java.util.*;
class LongestSubstringAtleaseKdistinct{
    
    public int longestSubstring(String s, int k) 
    {
        Map<Character, Integer> freqMap = new HashMap<Character, Integer>();
        for(int i=0;i<s.length();i++)
        {
            freqMap.put(s.charAt(i), freqMap.getOrDefault(s.charAt(i), 0) + 1);
           
        }
        boolean[] invalid = new boolean[s.length()];
        boolean isFullString = true;
        for(int i=0;i<s.length();i++)
        {
            if(freqMap.get(s.charAt(i))<k)
            {
                isFullString = false;
                invalid[i] = true;
            }
            
        }
        if(isFullString)
        {
            return s.length();
        }
        int start = 0;
        int end = 0;
        int n = s.length();
        int res = 0;
        while(end<n)
        {
            while(end<n && !invalid[end])
            {
                end++;
            }
            if(end<n && invalid[end])
            {
                if(start<=end)
                {
                    res = Math.max(res,longestSubstring(s.substring(start,end),k));
                }
                end++;
                start = end;
            }
        }
        if(!invalid[end-1])
        {
             res = Math.max(res,longestSubstring(s.substring(start,end),k));
        }
        return res;
    }
}


