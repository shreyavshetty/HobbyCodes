package cci.ArraysAndStrings;

import java.util.Scanner;

public class StringCompression {

    /*
        Time Complexity : O(n)
    */
    public static String solution(String s)
    {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while(i<s.length())
        {
            Character c = s.charAt(i);
            int charCount = 1;
            sb.append(c);
            i++;
            while(i<s.length() && c==s.charAt(i))
            {
                charCount++;
                i++;
            }
            sb.append(charCount);
        }
        if(sb.length()>=s.length())
            return s;
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            String s = inp.nextLine();
            System.out.println(solution(s));
           
        }
    }
    
}
