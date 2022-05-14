package object_oriented_programming;

public class Class {
    public static void main(String[] args) {

    Car Ford = new Car();
    Ford.price = 100;
    Ford.speed = 200;
    Ford.weight = 1500;

    Car Audi = new Car();
    Audi.price = 150;
    Audi.speed = 300;
    Audi.weight = 2000;

    System.out.println("Ford price: " + Ford.price + "$");
    System.out.println("Audi price: " + Audi.price + "$");
    }
}

class Car 
{
    int price;
    int speed;
    int weight;

    void start() {

    }

    void accelerate() {

    }
}

