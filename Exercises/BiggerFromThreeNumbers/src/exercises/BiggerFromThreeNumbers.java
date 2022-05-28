package exercises;

import java.util.Scanner;

public class BiggerFromThreeNumbers {
    public static void main(String[] args) {
    int a, b, c;

        System.out.println("Enter first number: ");
        a = getInt();
        System.out.println("Enter first number: ");
        b = getInt();
        System.out.println("Enter first number: ");
        c = getInt();

        if (a >= b) {
            if (a >= c) {
                System.out.println("The biggest is number: " + a); }
            else {
                System.out.println("The biggest is number: " + c); }
            }
            else {
            if (b >= c) {
                System.out.println("The biggest is number: " + b); }
                else {
                    System.out.println("The biggest is number: " + c); }
                }
            }

    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }
}
