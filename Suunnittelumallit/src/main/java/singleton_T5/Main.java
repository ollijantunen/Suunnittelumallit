/**
 *
 * @author Ode
 */

package singleton_T5;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

        OlutKaappi juoja1 = OlutKaappi.getInstance();

        System.out.println(juoja1.getOlutKaappi());

        ArrayList<String> juodutOluetJ1 = juoja1.getOlut(1);
        System.out.println("Ensimmäisen juojan olut: " + juodutOluetJ1);

        OlutKaappi juoja2 = OlutKaappi.getInstance();

        System.out.println(juoja2.getOlutKaappi());

        ArrayList<String> juodutOluetJ2 = juoja2.getOlut(4);
        System.out.println("Toisen juojan olut: " + juodutOluetJ2);
        
        System.out.println(juoja1.getOlutKaappi());
        
        juoja1.ostaOluet(juodutOluetJ1);
        juoja2.ostaOluet(juodutOluetJ2);
        
        System.out.println(juoja1.getOlutKaappi());

    }

}
