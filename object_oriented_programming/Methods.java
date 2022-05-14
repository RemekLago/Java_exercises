package object_oriented_programming;
public class Methods {
    public static void main(String[] args) {

    Test example_1 = new Test();

    example_1.printName("John", "Smith");

    example_1.lenghtName("John", "Smith");

    Test2 example_2 = new Test2();

    example_2.sumNumbers(2, 6);
    example_2.sumNumbers(2.5, 6.7);
    }
}

class Test
{
    void printName(String first_name, String last_name)
    {
        System.out.println(first_name + " " + last_name);
    }

    int lenghtName(String first_name, String last_name)
    {
        int result = first_name.length() + last_name.length();
        System.out.println(result);
        return result; 
    }
}

class Test2
{
    int sumNumbers(int x, int y)
    {
        int result = x + y;
        System.out.println(result);
        return result;
    }
    
    double sumNumbers(double x, double y) 
    {
        double result = x + y;
        System.out.println(result);
        return result;
    }

}