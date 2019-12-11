/**
 *
 * @author Ode
 */

package composite_T3;


public class Main {

   
    public static void main(String[] args) {
        ILaiteOsa tietokone = new Tietokone("Pöytätietokone");
        ILaiteOsa kotelo = new Kotelo("Fractal Design", 100);
        ILaiteOsa emolevy = new Emolevy("Asus", 240);
        ILaiteOsa prossu = new Prosessori ("Intel", 450);
        ILaiteOsa gpu = new GPU("MSI", 290);
        ILaiteOsa kiintolevy = new Kiintolevy ("Samsung", 130);
        ILaiteOsa tuuletin = new Tuuletin ("Noctua", 15);
        
        prossu.addLaiteOsa(tuuletin);
        emolevy.addLaiteOsa(prossu);
        emolevy.addLaiteOsa(gpu);
        kotelo.addLaiteOsa(kiintolevy);
        kotelo.addLaiteOsa(kiintolevy);
        kotelo.addLaiteOsa(tuuletin);
        kotelo.addLaiteOsa(emolevy);
        tietokone.addLaiteOsa(kotelo);
        
        System.out.println(tietokone.toString());
    }

}
