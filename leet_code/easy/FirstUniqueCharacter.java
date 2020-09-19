package leet_code.easy;

public class FirstUniqueCharacter {

    public int firstUniqChar(String s) {
        if(s==null || s.length()==0)
            return -1;
        int[] charArr = new int[26];
        for(int i=s.length()-1;i>=0;i--)
        {
            charArr[s.charAt(i)-'a']++;
           
        }
        for(int i=0;i<s.length();i++)
        {
            if(charArr[s.charAt(i)-'a']==1)
                return i;
           
        }
        return -1;
    }
    
}
