package chap1;

import java.util.Scanner;

/**
 * Created by wanyuezhang on 03/07/2017.
 * Write a function to check if they are one edit (or zero edits) away
 * Insert, remove, replace
 */
public class Q5 {
    public String getInput(){
        System.out.println("enter a string");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        return input;
    }
    public boolean isOneEdit(String input1, String input2){
        int length1 = input1.length();
        int length2 = input2.length();
        int difference = 0;
        if (Math.abs( length1 - length2 ) == 1){
            difference++;
            int i;
            int j = 0;

            for (i = 0; i < Math.min(length1, length2); i++){

                    if (input1.charAt(i) != input2.charAt(i)) {

                        if (length1 < length2) {
                            j = i;
                            j--;
                        }
                        else{
                            j = i;
                            j++;
                        }
                    }
                    j++;
            }

            if (difference == 1) {
                return true;
            }
        }
        else if (Math.abs(length1 - length2) == 0){
            int i, j;
            for (i = 0; i < length1; i++){

                    if (input1.charAt(i) != input2.charAt(i)){
                        difference++;
                    }


            }

            if (difference <= 1)
                return true;
            else
                return false;

        }
        return false;

    }

    public static void main(String[] args){
        Q5 q5 = new Q5();
        String input1 = q5.getInput();
        String input2 = q5.getInput();
        System.out.println(q5.isOneEdit(input1, input2));
    }

}
