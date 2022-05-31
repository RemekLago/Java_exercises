public class IsNumberEvenTests {
    public static void main(String[] args) {

        isEven_numberEvenPositive_returnEven();
        isEven_numberEvenNegative_returnEven();
        isEven_numberOddPositive_returnOdd();
        isEven_numberOddNegative_returnOdd();
        isEven_numberZero_returnEven();
    }
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    public static void isEven_numberEvenPositive_returnEven() {
        assertEquals(true, isEven(10));
    }
    public static void isEven_numberEvenNegative_returnEven() {
        assertEquals(true, isEven(-2));
    }
    public static void isEven_numberOddPositive_returnOdd() {
        assertEquals(false, isEven(999));
    }
    public static void isEven_numberOddNegative_returnOdd() {
        assertEquals(false, isEven(-9));
    }
    public static void isEven_numberZero_returnEven() {
        assertEquals(true, isEven(0));
    }
    public static void assertEquals(boolean expected, boolean actual) {
        if (expected != actual) {
            System.out.println("It should be " + actual +
                    ", but result is: " + expected);
        }
    }
}