import java.util.Scanner;

public class NumbersSorting {
    public static void main(String[] args) {
        int[] numbers = new int[8];
        System.out.println("Enter " + numbers.length + " numbers:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print((i + 1) + " number: ");
            numbers[i] = getInt();
        }

        for (int i = 1; i < numbers.length; i++) {
            int actualNumber = numbers[i];
            int j = i - 1;
            while (j >= 0 && numbers[j] > actualNumber) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j + 1] = actualNumber;
        }

        System.out.println("Sorted numbers:");
        for (int x : numbers) {
            System.out.print(x + ", ");
        }
    }
    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }
}