package object_oriented_programming.Monsters_inheritance;

public class Monster {
    public double speed;
    public double live_point;


    public void attack()
    {
        /*

        */
        System.out.println("This is the method attack from class Monster");
    }

    public Monster()
    {

    }

    public Monster(double speed, double live_point)
    {
        this.speed = speed;
        this.live_point = live_point;
    }
}
