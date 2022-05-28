package exercises;

import java.util.Scanner;

public class BiggerFromTwoNumbers {
    public static void main(String[] args) {
        int x, y;
        System.out.println("Enter number one: ");
        x = getInt();

        while (true) {
            System.out.println("Do you want to continue? [y/n]");
            String isEnd = getString();

            if (isEnd.equals("n")) {
                break;
            }

            System.out.println("Enter next number to compare: ");
            y = getInt();

            if (x > y) {
            System.out.println("Number " + x + " is bigger");}
            else {
                System.out.println("Number " + y + " is bigger");
            }
        }
    }

    public static int getInt() {
        return new Scanner(System.in).nextInt(); }
    public static String getString() {
        return new Scanner(System.in).next();
    }
}
