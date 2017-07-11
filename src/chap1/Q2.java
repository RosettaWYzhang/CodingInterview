package chap1;

import java.util.Scanner;
import java.util.Arrays;

/**
 * Created by wanyuezhang on 22/06/2017.
 */
// Given two strings, write a method to decide if one is a permutation of the other
public class Q2 {

    public void getInput(){
        System.out.println("enter a string 1");
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();

        System.out.println("enter a string 2");
        String input2 = sc.nextLine();

        boolean result = isPermute(input1, input2);
        System.out.println(result);
    }


    public boolean isPermute(String input1, String input2){
        if (input1.length()!=input2.length()){
            return false;
        }
        char[] char1 = input1.toCharArray();
        char[] char2 = input2.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);

        int i;
        int length = input1.length();
        for (i = 0; i < length; i++){
            System.out.println(char1[i]+" "+char2[i]);
            if (char1[i] != char2[i]){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args){
        Q2 q2 = new Q2();
        q2.getInput();
    }
}
