import com.sun.jdi.event.MonitorWaitedEvent;

import java.util.Scanner;

public class Bomb {

    public static int takeNumber(){
        int clock;
        System.out.println("Please enter a number to start counting to an explosion");
        Scanner scanner = new Scanner(System.in);
        clock = scanner.nextInt();
        return clock;
    }
    public static void countingTo(int time) throws InterruptedException {
        while (time > 0){
            System.out.println("Bomb will explode in " + time + " second");
            time--;
            Thread.sleep(1000);
        }
        System.out.println("BOOM");
    }
}
