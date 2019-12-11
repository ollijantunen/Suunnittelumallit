package builder_T14;

/**
 *
 * @author Ode
 */
public class McBuilder extends BurgerBuilder {
    private String nimi = "McDonalds";
    private StringBuilder burgerString;
    private String sampyla = "Ruissämpylä";
    private String pihvi = "Naudanliha (100% 150g)";
    private String juusto = "Kermajuusto";
    private String salaatti = "Romaine-salaatti";
    
    @Override
    public Object getBurger() {
        return burgerString;
    }

    @Override
    public void createBurger() {
        this.burgerString = new StringBuilder(nimi + "-burgerin sisältö: ");
    }

    @Override
    public void buildSampyla() {
        burgerString.append(sampyla + ", ");
    }

    @Override
    public void buildPihvi() {
        burgerString.append(pihvi + ", ");
    }

    @Override
    public void buildJuusto() {
        burgerString.append(juusto + ", ");
    }

    @Override
    public void buildSalaatti() {
        burgerString.append(salaatti + ".");
    }
    
}
