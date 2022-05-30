package Animals;

public class Hippo {
    private String food;
    private int hunger = 5;
    private AnimalPosition position = new AnimalPosition(0, 0);
    private AnimalTerritory territory;

    public Hippo( String food, double territoryX, double territoryY) {
    this.food = food;
    this.territory = new AnimalTerritory(territoryX, territoryY);
    }

    public int noise() {
        if (hunger <= 8) {
            System.out.println("Noising...");
            return hunger += 1; }
        System.out.println("I can't do a noise...");
        return hunger;
    }

    public void eat() {
        if (hunger > 0) {
            System.out.println("Eating...");
            hunger -= 1;
        }
        System.out.println("I can't eat...");
    }
    public void sleep() {
        if (hunger < 8) {
            System.out.println("Sleeping...");
            hunger = 10;}
        System.out.println("I can't sleep...");
    }

//    public void travel(int newX, int newY) {
//        if (newX >= areax1 && newX <= areax2 && newY >= areay1 && newX <= areay2) {
//            System.out.println("Travelling to ...");
//            x = newX;
//            y = newY;
//        }
//        System.out.println("Point is aut of my range");
//    }
}