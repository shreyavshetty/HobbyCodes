package cci.ArraysAndStrings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IsUnique {

    /*
        time complexity : O(n) where n is the length of the string
        space complexity : O(n) 
    */
    public static boolean solution1(String s)
    {
        Set<Character> charSet = new HashSet<Character>();
        for(char c : s.toCharArray())
        {
            if(charSet.contains(c))
            {
                return false;
            }
            charSet.add(c);
        }
        return true;
    }

    /*
        time complexity : O(n) where n is the length of the string
        space complexity : O(c) where c = 256 
    */
    public static boolean solution2(String s)
    {
        boolean[] charUniq = new boolean[256];
        for(char c : s.toCharArray())
        {
            if(charUniq[c-0]==true)
            {
                return false;
            }
            charUniq[c-0] = true;
        }
        return true;
    }
    /*
        time complexity : O(n^2) where n is the length of the string
        space complexity : O(1) 
    */
    public static boolean solution3(String s)
    {
       for(int i=0;i<s.length();i++)
       {
           char c = s.charAt(i);
           for(int j=i+1;j<s.length();j++)
           {
               if(c==s.charAt(j))
                    return false;
           }
       }
       return true;
    }

    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        int testCases = inp.nextInt();
        for(int i=0;i<testCases;i++)
        {
            String s = inp.nextLine();
            System.out.println(solution1(s));
            System.out.println(solution2(s));
            System.out.println(solution3(s));
        }

    }
}