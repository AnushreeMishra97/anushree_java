package day1.assignment4;

import java.util.Arrays;

public class MultiCommandLine {

     public void doOperation(String args[]) {
          if (args[0].equals(1)) {
               int len = args.length;
               int array[] = new int[len];
               for (int i = 1; i <= len; i++) {
                    array[i] = Integer.parseInt(args[i]);
               }

               int sum = 0;
               for (int i = 0; i < array.length; i++) {
                    sum += array[i];
               }
               System.out.println("Sum is" + sum);
          }

          if (args[0].equals(2)) {
               int len = args.length;
               String s1[] = new String[len];
               for (int i = 1; i < len; i++) {

                    s1[i] = String.valueOf(args[i]);
                    System.out.println(Arrays.toString(s1).toLowerCase());

               }
          }


     }
}















