/**
 *
 * @author Ode
 */

package builder_T14;

import java.util.ArrayList;


public class Main {

   
    public static void main(String[] args) {
        
        TilausDirector tilaus = new TilausDirector();
        BurgerBuilder mc = new McBuilder();
        BurgerBuilder hese = new HeseBuilder();
        
        tilaus.setBurgerBuilder(mc);
        tilaus.constructBurger();
        Object burger = tilaus.getBurger();
        
        System.out.println(burger);
        System.out.println("");
        
        tilaus.setBurgerBuilder(hese);
        tilaus.constructBurger();
        burger = tilaus.getBurger();
        
        System.out.print("Hesburgerin sisältö: ");
        for (IOsat osa : (ArrayList<IOsat>)burger) {
            System.out.print(osa.getNimi() + ", ");
        }
        
    }

}
