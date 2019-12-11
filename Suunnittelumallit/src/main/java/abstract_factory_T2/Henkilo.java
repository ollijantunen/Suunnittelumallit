package abstract_factory_T2;

import java.util.ArrayList;

/**
 *
 * @author Ode
 */
public class Henkilo implements IHenkilo {
    private ArrayList<IVaate> vaatteet;
    private String nimi;
    
    public Henkilo (String nimi) {
        this.nimi = nimi;
    }

    @Override
    public void pueVaatteet(IAbstractFactory factory) {
        vaatteet = factory.toimitaVaatteet();
    }

    @Override
    public void kerroVaatteet() {
        System.out.println( nimi + " on pukenut seuraavat vaatteet:");
        for (IVaate vaate : vaatteet) {
            System.out.println(vaate);
        }
    }
    
}
