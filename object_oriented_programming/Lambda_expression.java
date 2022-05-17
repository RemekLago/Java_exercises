package object_oriented_programming;

public class Lambda_expression {
    public static void main(String[] args) {

        ActionAfterClick z = () -> {
            System.out.println("from anonymous class");
        };

        ActionAfterClick2 z2 = (a, b) -> a + b;

        Przycisk p = new Przycisk();

        p.addAction(() -> {
            System.out.println("from anonymous class");
        });

        int result = p.addAction2(5, 10, z2);

        System.out.println(result);

    }

}

interface ActionAfterClick {
    void action();
}

interface ActionAfterClick2 {
    int action2(int a, int b);
}

class Przycisk {

    void addAction(ActionAfterClick z) {
        z.action();
    }

    int addAction2(int a, int b, ActionAfterClick2 z) {
        return z.action2(a, b);
    }

}

/*
 * LAMBDA WYRAŻENIE:
 * () -> {}
 * 
 * () - tu podajemy argumenty do przesłania do funkcji
 * -> - strzałka szybka informacja że mamy do czynienia z wyrażeniem lambda
 * {} - Treść wyrażenia
 * 
 */