package basics;

public class Variables {
    
    public static void main(String[] args) {
        int a = 10; 
        int b = 5;
        int c;
        c = a + b;

        System.out.println(c);

        String name = "Marta";
        String lastname = "Smith";

        System.out.println(name);
        System.out.println(name + " " + lastname);


        char sign = 'A'; 
        System.out.println(sign);

        float number1 = 4.57f;
        double number2 = 56.6121034;

        System.out.println(number1);
        System.out.println(number2);

/*
    integer
    int - 32 bits, from (-2 ^ 31) to (2 ^ 31 - 1)
  
    byte - 8 bits, from 128 to 127
    short - 16 bits, from (-2 ^ 63) to (2 ^ 63 - 1)
    long - 64 bits, from -32,768 to 32,767
    example: long a = 1234567891883L

    float - 32 bits
    double - 64 bits

    char - only 1 sign
    String - standard string

 */

    }
}
