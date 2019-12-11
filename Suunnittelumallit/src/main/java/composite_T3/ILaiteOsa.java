package composite_T3;

import java.util.ArrayList;

/**
 *
 * @author Ode
 */
public interface ILaiteOsa {
    
    void addLaiteOsa(ILaiteOsa laiteOsa);
    int getHinta();
    
    @Override
    String toString();
}
