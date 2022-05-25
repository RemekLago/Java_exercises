package exercises;

import java.util.Scanner;

public class IsOfAge18 {
    public static void main(String[] args) {
        int userAge;
        boolean isofage18;

        System.out.println("Enter your age: ");
        userAge = getInt();


        isofage18 = userAge >= 18 ? true : false;
        System.out.println("Is user of age 18?: " + isofage18);

        /*
        if (userAge >= 18) {
            isofage18 = true;
            System.out.println("Is user of age 18?: " + isofage18);
        } else {
            isofage18 = false;
            System.out.println("Is user of age 18?: " + isofage18);
        }
        */
    }

    public static int getInt(){
        return new Scanner(System.in).nextInt();
    }
}
