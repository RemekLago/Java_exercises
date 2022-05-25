package exercises;

import java.util.Scanner;

public class CircleAreaWhile {
    public static void main(String[] args) {
        int radius;

        do {
            System.out.print("Enter radius: ");
            radius = getInt();
            if (radius <= 0) {
                System.out.println(
                        "Incorrect number, enter number > 0"
                );
                continue;
            }
            double poleKola = 3.14 * radius * radius;
            System.out.println("Area is: " + poleKola);
        } while (radius <= 0);


    }

    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }

}
