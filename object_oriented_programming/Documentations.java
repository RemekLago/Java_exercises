/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package object_oriented_programming;

/**
 * Obiekt <code>Worker</code> reprezentuje Workera, jest to nadklasa
 * dla...
 * opis
 * opis
 * opis
 * 
 * @author Arkadiusz Włodarczyk
 * @version 1.0.4.2 06/08/2015
 * @see dokumentowanie.Worker#getSalary()
 * @see <a href="http://forum.videokurs.pl" target="_blank">forum video
 *      kursów</a>
 * 
 */
public class Worker {
    /**
     * Konstruktor domyślny
     */
    public Worker() {
    }

    /**
     * Konstruktor tworzący obiekt <code>Worker</code> z nameniem i nazwiskiem
     * 
     * @param name     ustawia imię
     * @param lastName ustawia lastName
     * 
     */
    public Worker(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    /**
     * Konstruktor tworzący obiekt <code>Worker</code> z nameniem i nazwiskiem
     * 
     * @param name          ustawia imię
     * @param lastName      ustawia lastName
     * @param Salary ustawia Salary
     */
    public Worker(String name, String lastName, double Salary) {
        this(name, lastName);
        this.Salary = Salary;
    }

    /**
     * <pre>
     * Jak używać:
     * 
     * Worker p = new Worker();
     * p.setSalary(1000);
     * </pre>
     * 
     * @param noweSalary - ustawia Workerowi nowe Salary
     */
    public void setSalary(double noweSalary) {
        this.Salary = noweSalary;
    }

    /**
     * @since 1.0.0.0 *
     * @return zwraca pensje typu double w zł
     */
    public double getSalary() {
        return this.Salary;
    }

    /**
     * Imię Workera
     */
    private String name;
    /**
     * lastName Workera
     */
    private String lastName;
    /**
     * Salary Workera w zł
     */
    private double Salary;
}
