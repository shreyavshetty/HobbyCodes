package cci.ArraysAndStrings;

import java.util.LinkedList;
import java.util.Queue;

public class URLify {
    
    public static int actualLength(char[] sArr)
    {
        int i = sArr.length-1;
        while(i>=0 && sArr[i]==' ')
            i--;
        return i+1;
    }
    /*
    Urlify backward
    Time Complexity : O(n)
    Space Complexity : O(1)
    */
    public static String getUrlifyString2(char[] sArr)
    {
        int actLeng = actualLength(sArr);
        int j = sArr.length-1;
        for(int i=actLeng-1;i>=0;i--)
        {
            if(sArr[i]!=' ')
            {
                sArr[j] = sArr[i];
                j--;
            }
            else
            {
                sArr[j] = '0';
                sArr[j-1]='2';
                sArr[j-2]='%';
                j = j-3;
            }
        }
        return new String(sArr);
    }
     /*
    Urlify forward
    Time Complexity : O(n)
    Space Complexity : O(n)
    */
    public static String getUrlifyString1(char[] sArr)
    {
        int actLeng = actualLength(sArr);
        char[] percArr = "%20".toCharArray();
        Queue<Character> charq = new LinkedList<>();
        int i =0;
        for(;i<actLeng;i++)
        {
            if(sArr[i]==' ')
            {
                if(charq.isEmpty())
                {
                    sArr[i] = percArr[0];
                    for(int j=1;j<percArr.length;j++)
                    {
                        i++;
                        charq.add(sArr[i]);
                        sArr[i] = percArr[j];
                    }
                
                }
                else{
                    sArr[i] = charq.poll();
                
                    for(int j=0;j<percArr.length;j++)
                    {
                        charq.add(percArr[j]);
                    }
                }
                
            }
            else
            {
                if(!charq.isEmpty())
                {
                    charq.add(sArr[i]);
                    sArr[i] = charq.poll();
                    
                }
            }
        }
        while(!charq.isEmpty())
        {
            sArr[i] = charq.poll();
            i++;
        }
        return new String(sArr);

    }
    public static void main(String[] args) {
        
        System.out.println(getUrlifyString1("Hey Tim, Whatsup?    ".toCharArray()));
        System.out.println(getUrlifyString1("Hey".toCharArray()));
        System.out.println(getUrlifyString2("Hey Tim, Whatsup?    ".toCharArray()));
        System.out.println(getUrlifyString2("Hey".toCharArray()));
    }
    
}
