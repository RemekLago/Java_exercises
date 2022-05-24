package exercises;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args){
        String userName;
        String userLastName;

        System.out.println("Please enter your name: ");
        userName = getString();
        System.out.println("Please enter your last name: ");
        userLastName = getString();
        char[] a = new char[2];
        (userName.toUpperCase()).getChars(0, 1, a, 0);
        (userLastName.toUpperCase()).getChars(0, 1, a, 1);
        char nameInitials = a[0];
        char lastNameInitials = a[1];

        System.out.println("Your Exercises.exercises.initials are: " + nameInitials + "." + lastNameInitials + ".");
    }

    public static String getString() {
        return new Scanner(System.in).next();
    }
}