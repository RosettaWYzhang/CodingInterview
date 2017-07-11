package chap1;

import java.util.Scanner;

/**
 * Created by wanyuezhang on 04/07/2017.
 * String compression
 * assume only nuppercase and lowercase letter a-z
 */
import java.util.ArrayList;
public class Q6 {
    public int string_length;

    public ArrayList<Character> compressed_string = new ArrayList();
    public ArrayList<Integer> frequency_list = new ArrayList();

    public String getInput(){
        System.out.println("enter a string");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        return input;
    }

    public void compute_frequency(String input){
        string_length = input.length();
        int i;
        int frequency = 1;
        int stop_point = 0;
        for (i = stop_point; i < string_length; i++){
            while (i < string_length-1 && input.charAt(i) == input.charAt(i+1) ){
                frequency++;
                i++;
            }
            //System.out.print(input.charAt(i));
            //System.out.print(frequency);
            compressed_string.add(input.charAt(i));
            frequency_list.add(frequency);
            frequency = 1;
            stop_point = i+1;
        }
        if (compressed_string.size() + frequency_list.size() >= string_length){
            System.out.println(input);
        }
        else {
            for (int j = 0; j < compressed_string.size(); j++){
                System.out.print(compressed_string.get(j));
                System.out.print(frequency_list.get(j));

            }
        }
    }



    public static void main(String[] args){

        Q6 q6 = new Q6();
        String input = q6.getInput();
        q6.compute_frequency(input);


    }


}
