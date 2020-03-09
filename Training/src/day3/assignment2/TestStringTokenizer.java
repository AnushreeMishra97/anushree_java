package day3.assignment2;

import java.util.StringTokenizer;

public class TestStringTokenizer {
    public void display(String args) {
        //StringTokenizer stringTokenizer=new StringTokenizer(args);
        StringTokenizer tokenReader = new StringTokenizer(args, ",");
        while (tokenReader.hasMoreTokens()) {
            System.out.println(tokenReader.nextToken());
        }

    }
}
