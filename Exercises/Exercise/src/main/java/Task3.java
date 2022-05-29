public class Task3 {public class Test2 {
    public static void main(String[] args) {
        float[] table = new float[4];
        table[0] = 4.2f;
        table[1] = 6.5f;
        table[2] = 13.1f;
        table[3] = 51.7f;

        float sum = 0.0f;
        for (float i : table) {
            sum += i;
        }
        System.out.println("Average: " + sum/table.length);
    }
}
    public static void main(String[] args) {

        int a = 12345;
        int b = 0;

        while (a > 0) {
            b = b * 10;
            b += (a % 10);
            a = a / 10;
            System.out.println("a: " + a);
            System.out.println("b: " + b);
        }
    }
}