package object_oriented_programming.Monsters_inheritance;

public abstract class Monster {
    public double speed;
    public double live_point;


    public void attack()
    {
        /*

        */
        System.out.println("This is the method attack from class Monster");
    }

    abstract void description();


    public Monster()
    {

    }

    public Monster(double speed, double live_point)
    {
        this.speed = speed;
        this.live_point = live_point;
    }
}
