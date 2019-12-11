package state_T7;

/**
 *
 * @author Ode
 */
public class Charmander extends PokemonState{
    private static Charmander charmander = null;
    private static String name = "Charmander";
    private static int level = 10;
    
    public static PokemonState getInstance() {
        if (charmander == null) {
            charmander = new Charmander();
        }
        return charmander;
    }

    @Override
    void stats(PokemonContext pokemon) {
        System.out.println("Your " + name + " is at lvl " + level + ".");
    }

    @Override
    void attack(PokemonContext pokemon) {
        System.out.println(name +  " attacked.");
    }

    @Override
    void evolve(PokemonContext pokemon) {
        System.out.println("Hey!!!\nIt seems " + name + " is evolving!\n");
        changeState(pokemon, Charmeleon.getInstance());
    }
}
