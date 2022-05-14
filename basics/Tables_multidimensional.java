package basics;

public class Tables_multidimensional {
    public static void main(String[] args) {

        int[][] tab1 = new int[4][3]; // new int[rows][columns]

        System.out.println(tab1[2][2]);

        int[][] tab2 = {
            {4, 15, 5},
            {5, 7, 43},
            {3, 8, 8},
            {8, 3, 1, 0}
        };
        
        System.out.println(tab2[3][1]);
    }
}
