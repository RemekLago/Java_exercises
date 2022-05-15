package object_oriented_programming;

public class Class_Object {
    public static void main(String[] args) {

        Object[] points = new Point[4];

        points[0] = new Point(2, 8);
        points[1] = new Point(4, 8);
        points[2] = new Point(7, 8);
        points[3] = new Point(2, 88);

        for (int i = 0; i < points.length; i++) {
            System.out.println(points[i]);
        }

    }

}

class Point {
    private int x;
    private int y;

    Point() {

    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;

        Point pointSended = (Point) obj;

        return this.x == pointSended.x && this.y == pointSended.y;
    }

    @Override
    public String toString() {
        return getX() + " " + getY();
    }

}