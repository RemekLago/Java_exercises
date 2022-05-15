package object_oriented_programming;

public class Instanceof {
    public static void main(String[] args)
    {
        Person[] person = new Person[4];
        person[0] = new Worker("Samanta", "Strange", 10000);
        person[1] = new Student("John", "Steedy");

        for (int i = 0; i < person.length; i += 1)
        {
            if (person[i] instanceof Person)
                person[i].description();
            else
                break;
        }
        // for (Person person1: person)
        // {
        //     if (person1 instanceof Person)
        //         person1.description();
        //     else
        //         break;
        // }
    }
}

abstract class Person
{
    String first_name;
    String last_name;

    Person(String first_name, String last_name)
    {
        this.first_name = first_name;
        this.last_name = last_name;
    }
    abstract void description();

}

class Worker extends Person
{
    double salary;

    Worker(String first_name, String last_name, double salary)
    {
        super(first_name, last_name);
        this.salary = salary; 
    }

    @Override
    void description()
    {
        System.out.println("first name: " + first_name);
        System.out.println("last name: " + last_name);
        System.out.println("salary: " + salary);
    }
}

class Student extends Person
{
    Student(String first_name, String last_name)
    {
        super(first_name, last_name);
    }
    
    @Override
    void description() 
    {
        
        System.out.println("first name: " + first_name);
        System.out.println("last name: " + last_name);
        System.out.println("salary: " + 0);
        
    }
}
