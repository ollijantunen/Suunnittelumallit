package observer_T4;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Ode
 */
public class DigitalClock implements Observer {
    private ClockTimer clocktimer;
    
    public DigitalClock (ClockTimer clocktimer) {
        this.clocktimer = clocktimer;
        this.clocktimer.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o == clocktimer) {
            draw();
        }
    }
    
    private void draw() {
        int h = clocktimer.getHour();
        int m = clocktimer.getMinute();
        int s = clocktimer.getSecond();
        System.out.println(h + " : " + m + " : " + s );
    }
    
}
