import java.util.Scanner;

public class Persons {
    String name;

    public Persons() {
    }

    public Persons(String name) {
        this.name = name;
    }

    public static String[] createPersonsTable(){
        String[] table = new String[5];
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i < 5){
            System.out.println("Please enter name: ");
            table[i] = scanner.nextLine();
            i++;
        }
        return table;
    }

    public static void printingNames(String[] table){
        for (String i : table){
            System.out.println("Name is: " + i);
        }
    }
}
