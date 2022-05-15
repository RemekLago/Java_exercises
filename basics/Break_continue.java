package basics;

public class Break_continue {
    public static void main(String[] args) {

        for (int j = 1; j <= 10; j += 1)
        {
            for (int i = 1; i <= 10; i += 1)
            {
                if (i == 4)
                    continue;
                System.out.print(i * j + " ");
            }    
            System.out.println();
        }

        for (int j = 1; j <= 10; j += 1) {
            for (int i = 1; i <= 10; i += 1) {
                if (i == 4)
                    break;
                System.out.print(i * j + " ");
            }
            System.out.println();
        } 

        for (int j = 1; j <= 10; j += 1) {
            if (j % 2 == 0)
                continue;
            for (int i = 1; i <= 10; i += 1) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }

    }
}
