package basics;

public class Operators_logic {

    public static void main(String[] args) {

        /*
        true
        false

        ! 
        !(true)
        !(false)

        && --> conjuction, 'and'
        || --> alternative, 'or'

        */


        int a = 5,
            b = 5,
            c = 7;

        if (a == b)
            System.out.println("yes");

        if (a == b && c >= b) 
            System.out.println("yes");

        if (a == b || c >= b)
            System.out.println("yes");
    }
}