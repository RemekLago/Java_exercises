package Animals;

public class Lion {
    private String food;
    private int hunger;
    private double x;
    private double y;
    private double areax1;
    private double areax2;
    private double areay1;
    private double areay2;

    public Lion(String food, int hunger, double x, double y, double areax1, double areax2, double areay1, double areay2) {
        this.food = food;
        this.hunger = hunger;
        this.x = x;
        this.y = y;
        this.areax1 = areax1;
        this.areax2 = areax2;
        this.areay1 = areay1;
        this.areay2 = areay2;
    }

    public int noise() {
        if (hunger <= 8) {
            System.out.println("Noising...");
            return hunger += 1; }
        else {
            System.out.println("I can't do a noise...");
            return hunger; }
        }

    public int eat() {
        if (hunger > 0) {
            System.out.println("Eating...");
            return hunger -= 1;
            }
        else {
            System.out.println("I can't eat...");
            return hunger; }
        }
    public int sleep() {
        if (hunger < 8) {
            System.out.println("Sleeping...");
            return hunger = 10;}
        else {
            System.out.println("I can't sleep...");
            return hunger; }
        }

    public void travel(int newX, int newY) {
        if (newX >= areax1 && newX <= areax2 && newY >= areay1 && newX <= areay2) {
            System.out.println("Travelling to ...");
            x = newX;
            y = newY;
        }
    }
}
