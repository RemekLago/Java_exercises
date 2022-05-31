public class CompareTableItems {
    public static void main(String[] args) {
        String[] first = { "Ala", "ma", "kota" };
        String[] second = { "Ala", "ma", "kota" };
        boolean isDifferent = false;

        if (first.length != second.length) {
            isDifferent = true; }
        else {
            for (int i = 0; i < first.length; i++) {
                if (!first[i].equals(second[i])) {
                    isDifferent = true;
                    break;
                }
            }
        }
        if (isDifferent) {
            System.out.println("Tables are not identical."); }
        else {
            System.out.println("Tables are identical.");
        }
    }
}