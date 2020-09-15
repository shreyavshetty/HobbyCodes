package cci.ArraysAndStrings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PalindromePermute {

    /*
        Time complexity : O(n)
        Space complexity : O(n)
    */
    public static boolean solution(String str)
    {
        int length = str.length();
        Map<Character, Integer> cfreq = new HashMap<>();
        for(Character c : str.toCharArray())
        {
            if(!cfreq.containsKey(c))
                cfreq.put(c, 0);
            cfreq.put(c, cfreq.get(c)+1);
        }
        int oddsCount = 0;
        for(Integer vals : cfreq.values())
        {
            if(vals%2!=0)
            {
                oddsCount++;
            }

        }
        if((length%2==0 && oddsCount==0) || (length%2!=0 && oddsCount==1))
            return true;
        return false;

    }
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
        int testCases = inp.nextInt();
        for(int i=0;i<testCases;i++)
        {
            String s = inp.nextLine();
            System.out.println(solution(s));
            
        }
    }
    
}
