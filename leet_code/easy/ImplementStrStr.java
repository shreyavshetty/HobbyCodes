/**
QuestionLink : https://leetcode.com/problems/implement-strstr/=
Time Complexity = O(n) n- length of string
Space Complexity = O(n)
**/
import java.util.*;
class Solution {
    public int strStr(String haystack, String needle) {
        
        if(needle == null || needle.length()==0)
        {
            return 0;
        }
        if(haystack == null || haystack.length()==0)
        {
            return -1;
        }
        int i = 0;
        Set<Integer> idxSet = new HashSet<Integer>();
        while(i<haystack.length())
        {
            if(haystack.charAt(i) == needle.charAt(0))
            {
                idxSet.add(i);
            }
            i++;
        }
        //System.out.println(idxSet.size());
        if(idxSet.size() == 0)
        {
            return -1;
        }
        int foundIdx = -1;
        boolean found = false;
        for(Integer idx : idxSet)
        {
             int j = idx;
             int k = 0;
             //System.out.println(idx);
             while(j<haystack.length() && k<needle.length() && haystack.charAt(j) == needle.charAt(k))
             {
                 //System.out.println("foundIdx"+foundIdx+" "+j+" "+k);
                 j++;
                 k++;

             }
            if(k==needle.length())
             {
                 foundIdx = idx;
                 found = true;
                 break;
             }
             else
             {
                 found = false;
                
             }
        }
        if(found == true)
        {
            return foundIdx;   
        }
        else
        {
            return -1;
        }
        
    }
}