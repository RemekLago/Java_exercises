package exercises;

import java.util.Scanner;

public class TheBiggestNumber {
    public static void main(System[] args){

        System.out.println("Enter your number: ");
        int theBiggestNumber = getInt();

        while (true) {
            System.out.println("Do you want to continue? [y/n]");
            String isEnd = getString();

            if (isEnd.equals("n")){
                break;
            }
            System.out.println("Enter your next number: ");
            int newNumber = getInt();

            if (newNumber > theBiggestNumber) {
                theBiggestNumber = newNumber;
            }
        }


    }

    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }
    public static String getString() {
        return new Scanner(System.in).next();
    }
}
