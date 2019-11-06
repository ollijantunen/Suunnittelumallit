/**
 *
 * @author Ode
 */

package factory_method_T1;


public class Main {

   
    public static void main(String[] args) {
        
        AterioivaOtus opettaja = new Opettaja();
        AterioivaOtus koodariopiskelija = new KoodariOpiskelija();
        AterioivaOtus vahtimestari = new Vahtimestari();
        
        opettaja.aterioi();
        koodariopiskelija.aterioi();
        vahtimestari.aterioi();
        
    }

}
