package state_T7;

/**
 *
 * @author Ode
 */
public class Charmeleon extends PokemonState {

    private static Charmeleon charmeleon = null;
    private static String name = "Charmeleon";
    private static int level = 46;

    public static PokemonState getInstance() {
        if (charmeleon == null) {
            charmeleon = new Charmeleon();
        }
        return charmeleon;
    }

    @Override
    void stats(PokemonContext pokemon) {
        System.out.println("Your " + name + " is at lvl " + level + ".");
    }

    @Override
    void attack(PokemonContext pokemon) {
        System.out.println(name + " attacked wildly.");
    }

    @Override
    void evolve(PokemonContext pokemon) {
        System.out.println("Hey!!!\nIt seems " + name + " is evolving!\n");
        changeState(pokemon, Charizard.getInstance());
    }
}
