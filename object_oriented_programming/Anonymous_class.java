package object_oriented_programming;

public class Anonymous_class {
    public static void main(String[] args) {
        // ActicionAfterClick z = new ActicionAfterClick() {
        //
        // @Override
        // public void action() {
        // System.out.println("jestem z klasy anonimowej");
        // }
        // };

        Button p = new Button();

        p.addAction(new ActicionAfterClick() {

            @Override
            public void action() {
                System.out.println("jestem z klasy anonimowej");
            }
        });

    }

}

interface ActicionAfterClick {
    void action();
}

class Button {

    void addAction(ActicionAfterClick z) {
        z.action();
    }

}

/*
 * JButton
 * button.addActionListener(new ActionListener() {
 * public void actionPerformed(ActionEvent e)
 * {
 * // do something.
 * }
 * });
 * 
 */