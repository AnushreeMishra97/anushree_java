package day2.assignment2;

public class CheckForVowel {
    public static void main(String[] args) {
        VowelConsonant vowelConsonant = new VowelConsonant();
        if (args.length == 1) {
            vowelConsonant.checkChar(args[0]);
        } else {
            System.out.println("Only Single Charchter allowed to enter");
        }
    }
}
