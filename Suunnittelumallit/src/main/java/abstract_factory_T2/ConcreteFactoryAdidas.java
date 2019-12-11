package abstract_factory_T2;

import java.util.ArrayList;

/**
 *
 * @author Ode
 */
public class ConcreteFactoryAdidas implements IAbstractFactory {
    String merkki = "Adidas";
    ArrayList<IVaate> vaatteet;
    private Farmarit farmarit;
    private TPaita tPaita;
    private Lippis lippis;
    private Kengat kengat;

    @Override
    public void teeVaatteet() {
        this.farmarit = new Farmarit(merkki);
        this.tPaita = new TPaita(merkki);
        this.lippis = new Lippis(merkki);
        this.kengat = new Kengat(merkki);
    }

    @Override
    public ArrayList<IVaate> toimitaVaatteet() {
        teeVaatteet();
        vaatteet = new ArrayList<>();
        vaatteet.add(farmarit);
        vaatteet.add(tPaita);
        vaatteet.add(lippis);
        vaatteet.add(kengat);
        
        return vaatteet;
    }
    
}
