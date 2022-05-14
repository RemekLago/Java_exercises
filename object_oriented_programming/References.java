package object_oriented_programming;

public class References {
    public static void main(String[] args) {

        int a = 53;
        int b = a;

        b = 30;

        System.out.println(a);
        System.out.println(b);

        Test x = new Test();
        Test y = x;

        y.a = 40;

        System.out.println(x.a);
    }
}

class Test
{
    int a = 20;
}
