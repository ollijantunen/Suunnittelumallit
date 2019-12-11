package abstract_factory_T2;

/**
 *
 * @author Ode
 */
public class Lippis implements IVaate {
    private String merkki;

    public Lippis(String merkki) {
        this.merkki = merkki;
    }

    @Override
    public String toString() {
        return "Lippis, joka on " + merkki + "-merkkinen.";
    }
    
}
