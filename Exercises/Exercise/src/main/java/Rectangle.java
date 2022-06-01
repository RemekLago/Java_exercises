public class Rectangle {

    private double base;

//    public Rectangle() {
//        System.out.println("Rectangle constructor");
//    }

    public Rectangle(double base) {
        this.base = base;
    }

    public double calculateArea() {
        double area = Math.pow(base, 2);
        System.out.println("Area: " + area);
        return area;
    }

    public double calculatePerimeter() {
        double perimeter = 4 * base;
        System.out.println("Perimeter: " + perimeter);
        return perimeter;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
}
