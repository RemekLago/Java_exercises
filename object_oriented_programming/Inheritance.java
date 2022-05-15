package object_oriented_programming;

import object_oriented_programming.Monsters_inheritance.Monster;
import object_oriented_programming.Monsters_inheritance.Skeleton;
import object_oriented_programming.Monsters_inheritance.Zombie;
import object_oriented_programming.Monsters_inheritance.Spider;

public class Inheritance {
    public static void main(String[] args) {

        // Monster m = new Monster();
        Skeleton s = new Skeleton();
        Zombie z = new Zombie();
        Spider sp = new Spider();

        Monster s2 = new Skeleton();
        Monster z2 = new Zombie();
        Monster sp2 = new Spider();

        System.out.println(sp.speed);
        System.out.println(s.speed);
        System.out.println(z.speed);
    }
    
}
