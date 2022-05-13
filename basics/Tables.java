package basics;

public class Tables {
    public static void main(String[] args){

        // int[] tab;
        // tab = new int[5];
        int[] tab1 = new int[5];

        tab1[0] = 20;
        tab1[1] = 10;
        tab1[2] = 7;
        tab1[3] = 15;
        tab1[4] = 12;

        System.out.println(tab1[0]); 

        int[] tab2 = { 3, 4, 6, 8, 15};
        System.out.println(tab2[2]); 

        int x = tab2.length;
        System.out.println(x);


    }
}
