package Animals;

public class animalsProgram {
    public static void main(String[] args) {

        Lion lion1 = new Lion("meat", 5, 7, 5, -5, 5, 9, -9);
        lion1.eat();
        lion1.sleep();
        lion1.noise();
        lion1.travel(3, 5);

    }
}
