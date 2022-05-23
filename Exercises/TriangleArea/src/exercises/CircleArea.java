package exercises;

public class CircleArea {
    public static void main(String[] args){
        int radiusCircle = 8;
        double pi = 3.15;

        double areaCircle = pi * radiusCircle * radiusCircle;
        double circumferenceCircle = 2 * pi * radiusCircle;

        System.out.println("Surface of a circle is: " + areaCircle);
        System.out.println("Circumference of a circle is: " + circumferenceCircle);
    }
}
