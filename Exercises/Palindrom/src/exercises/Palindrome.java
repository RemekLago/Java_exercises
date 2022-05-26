package exercises;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        System.out.println("Enter your word: ");
        String userWord = getStirng();
        boolean isPalindrome = true;
        int lengthWord = userWord.length();

        for (int i = 0; i < lengthWord / 2; i += 1) {
            if (userWord.charAt(i) != userWord.charAt(lengthWord - 1 - i)) {
                isPalindrome = false;
        }

        if (isPalindrome) {
            System.out.println("Your word '" + userWord + "' is a palindrome"); }
            else {
                System.out.println("Your word '" + userWord + "' is not a palindrome");
            }
        }



    }

    public static String getStirng(){
        return new Scanner(System.in).next();
    }
}
