import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {

        int table1[] = {1, 4, 5, 9, 12, 99, 101, 11};
        int table2[] = new int [table1.length];

        for (int i = 0; i < table1.length; i++) {
            table2[i] = table1[i];
        }

        System.out.println("Table1: " + Arrays.toString(table1));
        System.out.println("Table2: " + Arrays.toString(table2));
    }
}
