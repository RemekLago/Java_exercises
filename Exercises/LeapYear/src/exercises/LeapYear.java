package exercises;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int userYear;

        System.out.println("Enter year: ");
        userYear = getInt();

        if ((userYear % 4 == 0 && userYear % 100 != 0) || (userYear % 400 == 0)) {
            System.out.println("This year is a leap year"); }
        else {
            System.out.println("This year is not a leap year"); }
        }

    public static int getInt(){
        return new Scanner(System.in).nextInt();
    }

}
