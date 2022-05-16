package object_oriented_programming;

public class Inner_classes {
    public static void main(String[] args)
    {
        A inside = new A();
        A.B tmp = inside.new B();
        A.C tmp2 = new A.C();
    }
}

class A
{
    A()
    {
        System.out.println("Outside class A");
    }
    class B
    {
        
        B()
        {
            System.out.println("Inner class B");
        }
        void something()
        {
            test = 5;
        }
        private int tmp;
    }
    private int test;
      
    static class C 
    {
        C()
        {
            System.out.println("Inner class B C");
        }
    }
    void something2()
    {
      //  tmp = 2;
        B obj = new B();
        
    }
}
