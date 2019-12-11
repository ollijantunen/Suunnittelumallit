package builder_T14;

/**
 *
 * @author Ode
 */
public class Juusto implements IOsat {
    private String nimi;

    public Juusto(String nimi) {
        this.nimi = nimi;
    }

    @Override
    public String getNimi() {
        return this.nimi;
    }
}
