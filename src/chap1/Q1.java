package chap1;

import java.util.Scanner;

/**
 * Created by wanyuezhang on 22/06/2017.
 */
// implement an algorithm to determine if a string has all unique characters
// what if you cannot use additional data structures?

//a more efficient way would be creating an array of booleans, where the flag at index i indicates whether character i in the alphabet
// is contained in a string
public class Q1 {

    public void getInput() {
        System.out.println("enter a string");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        boolean result = isUniqueCharsBit(input);
        System.out.println(result);
    }

    boolean isUniqueChars(String str) {
        int checker = 0;
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) - 'a';
            if ((checker & (1 << val)) > 0) {
                return false;
            }
            checker |= (1 << val);
        }
        return true;
    }

    public static void main(String[] args) {
        Q1 q1 = new Q1();
        q1.getInput();
    }


    //bitwise operator
    public boolean isUniqueCharsBit(String str) {
        int checker = 0;
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) - 'a';
            if ((checker & ( 1 << val )) > 0){
                //System.out.println(val);
                return false;
            }
            checker |= (1 << val);
            }
        return true;
    }

}

    /*public boolean isUnique(String input){
        int i;
        int j;
        int strLength = input.length();
        for (i = 0; i < strLength; i++){
            for (j = i+1; j < strLength; j++){
                if ( input.charAt(i) == input.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }*/







