package object_oriented_programming;

import java.lang.Comparable;
import java.util.Arrays;
import java.util.Collections;

public class Interfaces {
    public static void main(String[] args)
    {
        int[] tab = new int[3];

        tab[0] = 3;
        tab[1] = -5;
        tab[2] = 13;

        Arrays.sort(tab);

        Worker[] Worker = new Worker[3];
        Worker[0] = new Worker(10000);
        Worker[1] = new Worker(1000);
        Worker[2] = new Worker(5000);

        System.out.println("Before sort: ");
        for (Worker p : Worker) {
            System.out.println(p.getsalary());
        }

        System.out.println(Worker[0].compareTo(Worker[1]));

        Arrays.sort(Worker, Collections.reverseOrder());

        System.out.println("After sort: ");
        for (Worker p : Worker) {
            System.out.println(p.getsalary());
        }

    }
}

interface nameInterface {
    double PI = 3.14; // public static final

    void cos(); // public abstract
}

interface cosik {

}

class Worker implements nameInterface, cosik, Comparable {

    @Override
    public void cos() {
                                                                       // Tools | Templates.
    }

    Worker(double salary) {
        this.salary = salary;
    }

    public double getsalary() {
        return this.salary;
    }

    private double salary;

    @Override
    public int compareTo(Object t) {
        Worker sended = (Worker) t;

        if (this.salary < sended.salary)
            return -1;

        if (this.salary > sended.salary)
            return 1;

        return 0;
    }

}
