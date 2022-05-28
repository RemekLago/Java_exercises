package exercises;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        String isEnd;
        do {
            System.out.println("Enter the first number: ");
            int number1 = getInt();
            System.out.println("Enter kind of operation [+ , - , * , / ]: ");
            String operation = getString();
            System.out.println("Enter the second number: ");
            int number2 = getInt();

            int result = 0;
            switch (operation) {
                case "+":
                    result = number1 + number2;
                    break;
                case "-":
                    result = number1 - number2;
                    break;
                case "*":
                    result = number1 * number2;
                    break;
                case "/":
                    if (number2 == 0) {
                        System.out.println("division by 0, number incorrect");}
                    else {
                        result = number1 / number2;
                        break; }
                default:
                    System.out.println("Operation incorrect, try again");
                }

                System.out.println("Result of operation is: " + result);
                System.out.println("Do you want to continue? [y/n]");
                isEnd = getString();
        }
        while (isEnd.equals("y"));
    }

    public static int getInt() {
        return new Scanner(System.in).nextInt(); }
    public static String getString() {
        return new Scanner(System.in).next(); }
}
