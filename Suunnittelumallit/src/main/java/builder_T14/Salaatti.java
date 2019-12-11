package builder_T14;

/**
 *
 * @author Ode
 */
public class Salaatti implements IOsat {
    private String nimi;

    public Salaatti(String nimi) {
        this.nimi = nimi;
    }

    @Override
    public String getNimi() {
        return this.nimi;
    }
}
