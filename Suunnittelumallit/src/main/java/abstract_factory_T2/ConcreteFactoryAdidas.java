package abstract_factory_T2;

import java.util.ArrayList;

/**
 *
 * @author Ode
 */
public class ConcreteFactoryAdidas implements IAbstractFactory {
    String merkki = "Adidas";
    ArrayList<IVaate> vaatteet;

    @Override
    public ArrayList<IVaate> toimitaVaatteet() {
        vaatteet = new ArrayList<>();
        vaatteet.add(new Farmarit(merkki));
        vaatteet.add(new TPaita(merkki));
        vaatteet.add(new Lippis(merkki));
        vaatteet.add(new Kengat(merkki));
        
        return vaatteet;
    }
    
}
