package basics;

import javax.lang.model.util.ElementScanner14;

public class Conditional_expressions {

    public static void main(String[] args){

        int x = 5;

        if (x % 2 == 0)
            System.out.println("the number is even");
        else
            System.out.println("the number is odd");

        /*
          
        String A = x % 2 == 0 ? "the number is even" : "the number is odd"
        System.out.println(A) 
        
         */
    }
    
}
