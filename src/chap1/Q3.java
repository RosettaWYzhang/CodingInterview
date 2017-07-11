package chap1;

import java.util.Scanner;

/**
 * Created by wanyuezhang on 27/06/2017.
 */
public class Q3 {
    public char[] getInput(){
        System.out.println("enter a string");
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        //char[] input2 = Arrays.copyOf(input1.toCharArray(), 25);
        return input1.toCharArray();
    }

    public static void main(String[] args){
        Q3 q3 = new Q3();
        char[] input = q3.getInput();
        String input1 = new String(input);

        input1 = input1.replaceAll(" ", "%20");
        System.out.println(input1);

    }
}
