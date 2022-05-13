package basics;

public class Conditional_statements {
    public static void main(String[] args) {

        /*
        
        if (conditions1)
            instruction1;
        else if (conditions2)
            instruction2;
        else
            {
                instruction3;
                instruction4;
            }

        */

        int a = 5,
            b = 7,
            c = 9;

        if (b > a)
            System.out.println("b > a");
        else if (b == a)   
        System.out.println("b == a");
        else
            System.out.println("b < a");
        
        if (a > c)
            System.out.println("a > c");
        else if (b == a)   
        System.out.println("a == c");
        else
        {
            System.out.println("a < c");
            System.out.println(a);
        }

    }
}
