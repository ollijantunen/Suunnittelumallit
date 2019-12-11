package observer_T4;

import java.util.Observable;

/**
 *
 * @author Ode
 */
public class ClockTimer extends Observable {
    private int hour;
    private int minute;
    private int second;
    
    public void tick() {
        this.second++;
        if (this.second > 59) {
            this.second = 0;
            this.minute++;
            if (this.minute > 59) {
                this.minute = 0;
                this.hour++;
                if (this.hour > 23) {
                    this.hour = 0;
                }
            }
        }
        setChanged();
        notifyObservers();
    }
    
    public int getHour() {
        return this.hour;
    }
    
    public int getMinute() {
        return this.minute;
    }
    
    public int getSecond() {
        return this.second;
    }
}
