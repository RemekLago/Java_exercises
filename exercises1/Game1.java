package exercises1;

class User
{
    int number = 0;
    // method guess gives a number chosen by system, it is aim for users to guess
    public void quess()
    {
        number = (int) (Math.random() * 10);
        System.out.println("Chosen number is: " + number);
    }
}

class Game 
{
    User user1;
    User user2;
    User user3;

    public void start()
    {
        user1 = new User();
        user1 = new User();
        user1 = new User();
    }

    int typeuser1 = 0;
    int typeuser2 = 0;
    int typeuser3 = 0;

    boolean user1quess = false;
    boolean user2quess = false;
    boolean user3quess = false;

    int numberToQuess = (int) (Math.random() * 10);
    System.out.println("You have to quess number from 0 to 9");

    while true
    {
        System.out.println("Who will choose numer " + numberToQuess + " win the game");

        user1.quess();
        user2.quess();
        user3.quess();

        System.out.println("User1 chosen number: " + user1.number);
        System.out.println("User2 chosen number: " + user2.number);
        System.out.println("User3 chosen number: " + user3.number);

        if (user1.number == numberToQuess)
        {
            user1quess = true;
        }
        if (user2.number == numberToQuess)
        {
            user2quess = true;
        }
        if (user3.number == numberToQuess)
        {
            user3quess = true;
        }

        if (user1quess || user2quess || user3quess)
        {
             System.out.println("The number has been quessed");
             System.out.println("User1 is winner: " + user1quess);
             System.out.println("User2 is winner: " + user2quess);
             System.out.println("User3 is winner: " + user3quess);
        }
        else
        {
            System.out.println("Nobody guessed the number, try again");
        }
    }
    }

public class Game1 {
    public static void main(String[] args){

        Game game = new Game();
        game.start();
    }        
}