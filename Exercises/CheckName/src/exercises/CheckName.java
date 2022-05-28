package exercises;

import java.util.Scanner;

public class CheckName {
    public static void main( String[] args) {
        String name;

        System.out.println("Enter your name: ");
        name = getString();

        if (name.equals("Remek")) {
            System.out.println("Our names are the same:)"); }
            else {
                System.out.println("Our names are different");}
        }

    public static String getString() {
        return new Scanner(System.in).next();
    }
}



