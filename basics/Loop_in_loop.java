package basics;

public class Loop_in_loop {
 
    public static void main(String[] args) {

        for (int j = 1; j <= 10; j += 1) {
            for (int i = 1; i <= 10; i += 1) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}