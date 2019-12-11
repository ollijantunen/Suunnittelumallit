package abstract_factory_T2;

/**
 *
 * @author Ode
 */
public class Kengat implements IVaate {
    private String merkki;

    public Kengat(String merkki) {
        this.merkki = merkki;
    }

    @Override
    public String toString() {
        return "Kengät, jotka ovat " + merkki + "-merkkiset.";
    }
    
}
