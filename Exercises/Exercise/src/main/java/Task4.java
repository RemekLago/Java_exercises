public class Task4 {
    public static void main(String[] args) {

/*        int table[] = {1, 4, 5, 9, 12, 99};
        int a = 0;
        for (int element : table) {

            if (element == 9) {
                System.out.println("Index of number 9 is: " + a);
                break;}
                a += 1;
            }*/

        int table[] = {1, 4, 5, 9, 12, 99};
        int value = 9;
        for (int i = 0; i < table.length; i++) {
            if (table[i] == value) {
                System.out.println("Index of number " + value +  "is: " + i);
                break;
            }

            }

        }
    }
