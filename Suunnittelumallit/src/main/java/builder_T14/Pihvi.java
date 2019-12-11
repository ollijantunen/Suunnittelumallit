package builder_T14;

/**
 *
 * @author Ode
 */
public class Pihvi implements IOsat {
    private String nimi;

    public Pihvi(String nimi) {
        this.nimi = nimi;
    }

    @Override
    public String getNimi() {
        return this.nimi;
    }
}
