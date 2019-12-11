/**
 *
 * @author Ode
 */

package chain_of_responsibility_T10;

import java.util.Scanner;


public class Main {

   
    public static void main(String[] args) {
        Lahiesimies le = new Lahiesimies();
        Paallikko p = new Paallikko();
        Toimitusjohtaja tj = new Toimitusjohtaja();
        
        le.setSuccessorAsema(p);
        p.setSuccessorAsema(tj);
        
        System.out.println("Syötä toiveprosentti:");
        Scanner s = new Scanner(System.in);
        int palkka = Integer.parseInt(s.nextLine());
        
        le.kasittelePyynto(palkka);
        
        
    }

}
