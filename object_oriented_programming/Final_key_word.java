package object_oriented_programming;

import java.util.Date;

public class Final_key_word {
    public static void main(String[] args) {

        final double PI;  // final -> can't be change
        PI = 3.14;  

        Worker p = new Worker();
        System.out.println(p.start_date);
    }
}

abstract class Person
{

}

class Worker extends Person
{
    Worker()
    {
        this.start_date = new Date();
    }
    Worker(Date date)
    {
        this.start_date = date;
    }
    
    Date getStartDate()
    // final Date getStartDate() -> if if final Date getStartDate is not possible to change (in class Programmer)
    {
        return this.start_date;
    }
    
    final Date start_date;
}

class Programmer extends Worker
{
    Date getStartDate()
    {
        return this.start_date;
    }
}