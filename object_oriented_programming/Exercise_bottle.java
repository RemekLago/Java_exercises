package object_oriented_programming;
public class Exercise_bottle {
    public static void main(String[] args) {

        Bottle[] bottle = new Bottle[3];

        bottle[0] = new Bottle(5);
        bottle[1] = new Bottle(8);
        bottle[2] = new Bottle(10);

        bottle[0].fillin(4);
        bottle[0].transfer(4, bottle[1]);


        System.out.println(bottle[0].getHowManyLitres());
        System.out.println(bottle[1].getHowManyLitres());
        System.out.println(bottle[2].getHowManyLitres());
}}

class Bottle {
    double howManyLiters;

    Bottle(double howManyLiters)
    {
        this.howManyLiters = howManyLiters;
    }

    double getHowManyLitres()
    {
        return howManyLiters;
    }

    void fillin(double liters)
    {
        this.howManyLiters += liters;
    } 
    
    boolean fillout(double liters) {

        if (liters > howManyLiters)
            this.howManyLiters -= liters;
        else
            return false;
        return true;
    }

    void transfer (double liters, Bottle transferWhere)
    {
        if (this.fillout(liters));
            transferWhere.fillin(liters);
    }
    }
