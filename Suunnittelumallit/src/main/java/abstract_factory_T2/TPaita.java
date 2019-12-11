package abstract_factory_T2;


/**
 *
 * @author Ode
 */
public class TPaita implements IVaate {
    private String merkki;

    public TPaita(String merkki) {
        this.merkki = merkki;
    }

    @Override
    public String toString() {
        return "T-paita, joka on " + merkki + "-merkkinen.";
    }

}
