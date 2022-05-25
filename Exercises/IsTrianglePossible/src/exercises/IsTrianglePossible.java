package exercises;

import java.util.Scanner;

public class IsTrianglePossible {
    public static void main(String[] args) {

        int a, b, c;

        System.out.println("Enter length of side a: ");
        a = getInt();
        System.out.println("Enter length of side b: ");
        b = getInt();
        System.out.println("Enter length of side c: ");
        c = getInt();

        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("Building a triangle is possible"); }
            else {
                System.out.println("Building a triangle is impossible");
            }
        }
    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }
}