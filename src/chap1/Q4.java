package chap1;

import java.util.Scanner;

/**
 * Created by wanyuezhang on 02/07/2017.
 * Given a string, write a function to check if it is a permutation of a palindrome
 */

public class Q4 {
    boolean isPermutationOfPalindrome(String phrase){
        int bitVector = createBitVector(phrase);
        return bitVector == 0 || checkExactlyOneBitSet(bitVector);
    }

    /* create a bit vector for the string. For each letter with value i, toggle the ith bit
     */
    int createBitVector( String phrase){
        int bitVector = 0;
        for ( char c : phrase.toCharArray()){
            int x = c;
            bitVector = toggle(bitVector, x);
        }
        return bitVector;
    }

    /* Toggle the ith bit in the integer */
    int toggle(int bitVector, int index){
        if (index < 0)
            return bitVector;
        int mask = 1 << index;
        if ((bitVector &  mask) == 0){
            bitVector |= mask;
        }
        else{
            bitVector &= ~mask;
        }
        return bitVector;
    }

    /* Check that exactly one bit is set by substracting one from the integer and
       And it with the original integer.
     */
    boolean checkExactlyOneBitSet(int bitVector){
        return (bitVector & (bitVector - 1)) == 0;
    }

    public String getInput(){
        System.out.println("enter a string");
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        return input1;
    }

    public static void main(String[] args){
        Q4 q4 = new Q4();
        String input = q4.getInput();
        System.out.println(q4.isPermutationOfPalindrome(input));

    }

}


// probably should trim white space as "Tact Coa" returns false