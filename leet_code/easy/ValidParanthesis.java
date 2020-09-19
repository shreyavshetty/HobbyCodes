package leet_code.easy;

import java.util.Stack;

public class ValidParanthesis {

    public boolean isValid(String s) {
        
        Stack<Character> paraStk = new Stack<Character>();
        int i = 0;
        while(i<s.length())
        {
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{')
            {
                paraStk.push(s.charAt(i));
            }
            else
            {
                if(paraStk.isEmpty())
                    return false;
                if(s.charAt(i)==')' && paraStk.peek()!='(')
                {
                    return false;
                }
                if(s.charAt(i)==']' && paraStk.peek()!='[')
                    return false;
                if(s.charAt(i)=='}' && paraStk.peek()!='{')
                    return false;
                paraStk.pop();
            }
            i++;
        }
        if(!paraStk.isEmpty())
            return false;
        return true;
        
    }
    
}
