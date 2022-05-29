public class Task1 {
    public static void main(String[] args) {
        float[] table = new float[4];
        table[0] = 4.2f;
        table[1] = 6.5f;
        table[2] = 9.1f;
        table[3] = 5.7f;

        float sum1 = 0.0f;
        for (int i = 0; i < table.length; i++) {
            sum1 += table[i];
        }
        System.out.println("Average: " + sum1/table.length);


        float sum2 = 0.0f;
        for (int i = table.length - 1; i >= 0; i--) {
            sum2 += table[i];
        }
        System.out.println("Average: " + sum2/table.length);
    }
}
