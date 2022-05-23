package exercises;

import java.util.Scanner;


public class TrianglePerimeter {
    public static void main(String[] args){
        int side1;
        int side2;
        int side3;
        int perimeter;

        System.out.println("Please enter side1: ");
        side1 = getInt();

        System.out.println("Please enter side2: ");
        side2 = getInt();

        System.out.println("Please enter side3: ");
        side3 = getInt();

        perimeter = side1 + side2 + side3;

        System.out.println
                ("Perimeter of the triangle: " + perimeter);
    }
    public static int Scanner(){
        return new Scanner(System.in).nextInt();
    }
    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }
}
