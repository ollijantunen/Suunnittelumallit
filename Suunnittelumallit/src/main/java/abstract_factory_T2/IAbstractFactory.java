package abstract_factory_T2;

import java.util.ArrayList;

/**
 *
 * @author Ode
 */
public interface IAbstractFactory {
    
    void teeVaatteet();
    
    ArrayList<IVaate> toimitaVaatteet();

}
