package state_T7;

/**
 *
 * @author Ode
 */
public class Charizard extends PokemonState {
    private static Charizard charizard = null;
    private static String name = "Charizard";
    private static int level = 123;

    public static PokemonState getInstance() {
        if (charizard == null) {
            charizard = new Charizard();
        }
        return charizard;
    }

    @Override
    void stats(PokemonContext pokemon) {
        System.out.println("Your " + name + " is at lvl " + level + ".");
    }

    @Override
    void attack(PokemonContext pokemon) {
        System.out.println(name + " attacked furiously.");
    }

    @Override
    void evolve(PokemonContext pokemon) {
        System.out.println("Hey!!!\nIt seems " + name + " rules the world already! So relax!\n\nAnd start over...\n");
        changeState(pokemon, Charmander.getInstance());
    }

}
