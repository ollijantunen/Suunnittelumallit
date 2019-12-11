package builder_T14;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ode
 */
public class HeseBuilder extends BurgerBuilder {
    private List<IOsat> burger;

    @Override
    public Object getBurger() {
        return this.burger;
    }

    @Override
    public void createBurger() {
        this.burger = new ArrayList<>();
    }

    @Override
    public void buildSampyla() {
        this.burger.add(new Sampyla("Täysjyvävehnäsämpylä"));
    }

    @Override
    public void buildPihvi() {
        this.burger.add(new Pihvi("Poron pihvi (100%, 250g)"));
    }

    @Override
    public void buildJuusto() {
        this.burger.add(new Juusto("Cheddar-juusto"));
    }

    @Override
    public void buildSalaatti() {
        this.burger.add(new Salaatti("Jäävuorisalaatti"));
    }
    
}
