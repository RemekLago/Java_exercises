package object_oriented_programming;

public class Static_method {
    public static void main(String[] args) {

    Client a = new Client("Anna");
    Client b = new Client("John");
    Client c = new Client("Clif");

    System.out.println(a.id);
    System.out.println(b.id);
    System.out.println(c.id);
    }
}

class Client
{
    Client(String name)
    {
        this.name = name;
        nextId += 1;
        id += nextId;
    }
    String name;
    int id = 0;
    static int nextId = 0;
}