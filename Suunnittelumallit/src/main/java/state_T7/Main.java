/**
 *
 * @author Ode
 */

package state_T7;


public class Main {

   
    public static void main(String[] args) {
        
        PokemonContext pokemon = new PokemonContext();
        
        for (int i = 0; i < 30 ; i++) {
            pokemon.stats();
            pokemon.attack();
            pokemon.evolve();
        }
        
    }

}
