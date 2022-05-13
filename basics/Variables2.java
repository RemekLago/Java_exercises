package basics;
public class Variables2 {

    public static void main(String[] args) {
        int a = 5, b = 2;
        double c = 12, d = 15;

        System.out.println(a / b);
        System.out.println((double) a / b);

//      int result1 = a / d; not correct
        int result2 = a / (int)d;
        double result3 = a / d;
        double result4 = a * c;

        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
    
}
