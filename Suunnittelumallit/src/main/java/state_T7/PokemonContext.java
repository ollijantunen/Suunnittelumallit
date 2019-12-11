package state_T7;

/**
 *
 * @author Ode
 */
public class PokemonContext {
    private PokemonState state;
    
    public PokemonContext() {
        this.state = Charmander.getInstance();
    }
    
    protected void changeState(PokemonState state) {
        this.state = state;
    }
    
    public void stats() {
        this.state.stats(this);
    }
    
    public void attack() {
        this.state.attack(this);
    }
    
    public void evolve() {
        this.state.evolve(this);
    }
    
}
