public class Circle {
double radius;

public double calculateArea() {
    double area = 3.14 * radius * radius;
    System.out.println("Area: " + area);
    return area;
}

public double calculatePerimeter() {
    double perimeter = 2 * 3.14 * radius;
    System.out.println("Perimeter: " + perimeter);
    return perimeter;
}

public double getRadius() {
    return radius;
}

public void setRadius(double radius) {
    this.radius = radius;
}
}
