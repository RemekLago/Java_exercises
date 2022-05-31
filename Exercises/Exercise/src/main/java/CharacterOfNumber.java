public class CharacterOfNumber {
    public static void main(String[] args) {
        sign_firstNegative_returnMinusOne();
        sign_zero_returnZero();
        sign_firstPositive_returnOne();
        sign_numberNegative_returnMinusOne();
        sign_numberPositive_returnOne();
    }
    public static int sign(int number) {
        return number == 0 ? 0 : (number < 0 ? -1 : 1);
    }
    public static void sign_firstNegative_returnMinusOne() {
        assertEquals(-1, sign(-1));
    }
    public static void sign_zero_returnZero() {
        assertEquals(0, sign(0));
    }
    public static void sign_firstPositive_returnOne() {
        assertEquals(1, sign(1));
    }
    public static void sign_numberNegative_returnMinusOne() {
        assertEquals(-1, sign(-20));
    }
    public static void sign_numberPositive_returnOne() {
        assertEquals(1, sign(100));
    }
    public static void assertEquals(int expected, int actual) {
        if (expected != actual) {
            System.out.println("Should be " + actual +
                    ", but is: " + expected);
        }
    }
}
