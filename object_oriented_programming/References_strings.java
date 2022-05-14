package object_oriented_programming;

public class References_strings {
    public static void main(String[] args) {

        String name1 = "John";
        String name2 = "John";

        /* not in this way

        if (name1 == name2)
            System.out.println("Are equal");
        */
        
        if (name1.equals(name2))
            System.out.println("Are equal");

    }
}
