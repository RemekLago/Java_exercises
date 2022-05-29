public class Task6 {
    public static void main(String[] args) {

        int table[] = {86, 41, 55, 9, 125, 99, 101, 11};
        int minValue = table[0];
        int maxValue = table[0];

        for (int i = 1; i < table.length; i++) {
            if (table[i] > maxValue) {
                maxValue = table[i]; }

            if (table[i] < minValue) {
                minValue = table[i];
                }
            }
        System.out.println("min: " + minValue);
        System.out.println("max: " + maxValue);
        }
    }

