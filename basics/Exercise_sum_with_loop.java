package basics;

public class Exercise_sum_with_loop {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6};
        
        int sum = 0;

        for (int i = 0; i < numbers.length; i++)
        {
            sum += numbers[i];
        }
        System.out.println("sum: " + sum);

// -------------------------------------------------------------

        int sum1 = 0;

        for (int number: numbers) {
            sum1 += number;
        }
        System.out.println("sum1: " + sum1);

    }
}
