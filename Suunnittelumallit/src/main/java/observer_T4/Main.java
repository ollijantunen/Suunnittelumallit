/**
 *
 * @author Ode
 */

package observer_T4;


public class Main {

   
    public static void main(String[] args) throws InterruptedException {
        ClockTimer clockTimer = new ClockTimer();
        DigitalClock digitalClock = new DigitalClock(clockTimer);

        for (int i = 0; i < 86400; i++) {
            Thread.sleep(5); // mielekas testaus
            clockTimer.tick();
        }
        
        
    }

}
