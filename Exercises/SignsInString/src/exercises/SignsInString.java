package exercises;

import java.util.Scanner;

public class SignsInString {
    public static void main(String[] args){

    String userWord;
    int wordLength;

    System.out.println("Enter your word: ");
    userWord = getString();
    wordLength = userWord.length();

        System.out.println("Your word has " + wordLength + " signs");
    }
    public static String getString(){
        return new Scanner(System.in).next();
    }
}
