
public class Task8 {
    public static void main(String[] args) {

        Triangle triangle1 = new Triangle();

        triangle1.setBase(5.0);
        triangle1.setHeight(7.0);
        triangle1.calculateArea();
        triangle1.calculatePerimeter();

        Circle circle1 = new Circle();

        circle1.setRadius(5.0);
        circle1.calculateArea();
        circle1.calculatePerimeter();

        Rectangle rectangle1 = new Rectangle(4.0);
        rectangle1.calculateArea();
        rectangle1.calculatePerimeter();

    }
}




