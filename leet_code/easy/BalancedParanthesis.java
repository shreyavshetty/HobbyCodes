/**
QuestionLink : https://leetcode.com/problems/valid-parentheses/
Time Complexity = O(n) n- length of string
Space Complexity = O(n)
**/
import java.util.*
class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> st = new Stack<Character>();
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c=='(' || c=='{' || c=='[')
            {
                st.push(c);
            }
            else
            {
                if(st.size()!=0 && ((c == ')' && st.peek() =='(') || (c == '}' && st.peek() =='{') || (c == ']' && st.peek() =='[')))
                {
                    st.pop();
                }
                else 
                {
                    return false;
                }
                
            }
        }
        if(st.size()==0)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}