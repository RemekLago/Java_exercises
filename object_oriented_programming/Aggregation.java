package object_oriented_programming;
public class Aggregation {
    public static void main(String[] args){

    Worker worker = new Worker("John", new Address("Newstreet", 10));

    System.out.println((worker));

    }
}

class Worker
{
    String name;
    Address address;

    public Worker(String name, Address address) {
    this.name = name;
    this.address = address;
    }

    @Override
    public String toString() {
        return this.name + ": " + address.streetName + address.streetNumber;
    }
}

class Address
{
    String streetName;
    int streetNumber;

    public Address(String streetName, int streetNumber) {
        this.streetName = streetName;
        this.streetNumber = streetNumber;
    }

}