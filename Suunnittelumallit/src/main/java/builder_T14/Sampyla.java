package builder_T14;

/**
 *
 * @author Ode
 */
public class Sampyla implements IOsat {
    private String nimi;
    
    public Sampyla (String nimi) {
        this.nimi = nimi;
    }

    @Override
    public String getNimi() {
        return this.nimi;
    }
    
}
