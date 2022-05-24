package exercises;

import java.util.Scanner;

public class Devision3 {
    public static void main(String[] args){

        int number;

        System.out.println("Enter number: ");
        number = getInt();

        if (number % 3 == 0) {
            System.out.println("Number" + number + " is divisible by 3"); }
            else {
            System.out.println("Number" + number + " is not divisible by 3"); }
    }

    public static int getInt(){
        return new Scanner(System.in).nextInt();
    }
}
