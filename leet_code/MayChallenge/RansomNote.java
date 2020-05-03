/**
QuestionLink : https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/534/week-1-may-1st-may-7th/3318/
Time Complexity = O(n) n- length of string
**/
import java.util.*;


class RansomNote{
    public boolean canConstruct(String ransomNote, String magazine) {
        
        int[] freq = new int[26];
        for(int i=0;i<ransomNote.length();i++)
        {
            freq[ransomNote.charAt(i)-'a']++;
        }
        for(int i=0;i<magazine.length();i++)
        {
            if(freq[magazine.charAt(i)-'a']>0)
            {
                freq[magazine.charAt(i)-'a']--;
            }
        }
        for(int i=0;i<26;i++)
        {
            if(freq[i]!=0)
            {
                return false;
            }
        }
        return true;
        
    }
}