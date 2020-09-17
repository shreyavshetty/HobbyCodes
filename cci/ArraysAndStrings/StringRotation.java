package cci.ArraysAndStrings;

public class StringRotation {

    public static void main(String[] args) {
        String s1 = "ilovecoding";
        String s2 = "codingilove";
        if(s1.length() == s2.length())
        {
            String concatString = s2+s2;
            return isSubstring(concatString, s1);
        }
    }
    
}



