package abstract_factory_T2;

/**
 *
 * @author Ode
 */
public class Farmarit implements IVaate {
    private String merkki;
    
    public Farmarit(String merkki){
        this.merkki = merkki;
    }

    @Override
    public String toString() {
        return "Farmarit, jotka ovat " + merkki + "-merkkiset.";
    }
}
