package object_oriented_programming;

public class Class2 {
    public static void main(String[] args) {

        Point A = new Point(2,5);

        System.out.println("parameter x = " + A.x);
        System.out.println("parameter y = " + A.y);

        Point B = new Point(5, 8);

        System.out.println("parameter x = " + B.x);
        System.out.println("parameter y = " + B.y);


    }
}

class Point
{
    Point()
    {
        System.out.println("Start");
    }
    Point(int x, int y)
    {
        System.out.println("Start with x, y");
        this.x = x;
        this.y = y;
    }

    int x;
    int y;
}
