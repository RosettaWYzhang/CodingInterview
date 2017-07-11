package chap1;

/**
 * Created by wanyuezhang on 08/07/2017.
 * method isString checks if one word is a substring of another
 * Given 2 strings, s1 and s2, write code to check if s2 is rotation of s1 using only one call to isSubstring
 */
public class Q9 {

    public boolean isSubstring(String s1, String s2){
        return s1.contains(s2);
    }

    boolean isRotation(String s1, String s2){
        int len = s1.length();
        if (len == s2.length() && len > 0){
            String s1s1 = s1 + s1;
            return isSubstring(s1s1, s2);
        }
        return false;
    }

    public static void main(String[] args){
        Q9 q9 = new Q9();

    }
}
