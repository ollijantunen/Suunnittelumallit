package command_T22;

/**
 *
 * @author Ode
 */
public class SeinaPainike {
    ICommand cmd;
    
    public SeinaPainike (ICommand cmd) {
        this.cmd = cmd;        
    }
    
    public void push() {
        this.cmd.execute();
    }
}
