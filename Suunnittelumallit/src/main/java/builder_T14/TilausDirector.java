package builder_T14;

/**
 *
 * @author Ode
 */
public class TilausDirector {
    private BurgerBuilder burgerBuilder;

    public Object getBurger() {
        return this.burgerBuilder.getBurger();
    }

    public void setBurgerBuilder(BurgerBuilder bb) {
        this.burgerBuilder = bb;
    }

    public void constructBurger() {
        this.burgerBuilder.createBurger();
        this.burgerBuilder.buildSampyla();
        this.burgerBuilder.buildPihvi();
        this.burgerBuilder.buildJuusto();
        this.burgerBuilder.buildSalaatti();
        
    }

}
