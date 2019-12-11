package state_T7;

/**
 *
 * @author Ode
 */
public abstract class PokemonState {
    abstract void stats(PokemonContext pokemon);
    abstract void attack(PokemonContext pokemon);
    abstract void evolve(PokemonContext pokemon);
    
    void changeState(PokemonContext pC, PokemonState pS) {
        pC.changeState(pS);
    }
    
}
