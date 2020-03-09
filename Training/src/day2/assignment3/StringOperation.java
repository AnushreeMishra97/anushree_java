package day2.assignment3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.regex.Pattern;

public class StringOperation {
    public void doOperationWithRegEX(String args[]) {
        int command = Integer.parseInt(args[0]);
        if (command == 1) reverse(args);
        else count(args);
    }

    //For reversing the words of string
    public void reverse(String args[]) {
        String str = Arrays.toString(args);
        Pattern pattern = Pattern.compile("\\s");
        String temp[] = pattern.split("");
        String reverseString = "";
        //for iterating temp array and store it in reverse order
        for (int i = 0; i < temp.length; i++) {
            if (i == temp.length - 1) {
                reverseString = temp[i] + reverseString;
            } else {
                reverseString = "" + temp[i] + reverseString;
            }
        }
        System.out.println(reverseString);
    }

    //For counting number of lowercase,uppercase letter and digit in a string.
    public void count(String args[]) {
        String str = Arrays.toString(args);
        int upper = 0, lower = 0, digit = 0;

        for (int i = 0; i < args.length; i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                upper++;
            else if (ch >= 'a' && ch <= 'z')
                lower++;
            else digit++;
        }
        System.out.println("Count of lowercase,upperCase character and digit is:" + upper + lower + digit);
    }

}
