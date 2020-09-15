package cci.ArraysAndStrings;

import java.util.Scanner;

public class CheckPermutation {

    /*
        time complexity : O(n), n -> length of string
        spave complexity : O(c), c-> 256
    */
    public static boolean solution(String s1, String s2)
    {
        if((s1==null && s2==null ) || (s1.length()==0 && s2.length()==0))
            return true;
        if(s1==null || s2==null || s1.length()!=s2.length())
            return false;
        int[] charArr = new int[256];
        for(int i=0;i<s1.length();i++)
        {
            charArr[s1.charAt(i)-'0']++; 
        }
        for(int i=0;i<s2.length();i++)
        {
            charArr[s2.charAt(i)-'0']--; 
        }
        for(int i=0;i<256;i++)
        {
            if(charArr[i]!=0)
                return false;
        }
        return true;

    }
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
        int testCases = inp.nextInt();
        for(int i=0;i<testCases;i++)
        {
            String s1 = inp.nextLine();
            String s2 = inp.nextLine();
            System.out.println(solution(s1, s2));
            
        }
    }
    
}


