package object_oriented_programming;

import object_oriented_programming.Monsters_inheritance.Monster;
import object_oriented_programming.Monsters_inheritance.Skeleton;
import object_oriented_programming.Monsters_inheritance.Zombie;

public class Inheritance {
    public static void main(String[] args) {

        Monster m = new Monster();
        Skeleton s = new Skeleton();
        Zombie z = new Zombie();

        System.out.println(m.speed);
        System.out.println(s.speed);
        System.out.println(z.speed);
    }
    
}
