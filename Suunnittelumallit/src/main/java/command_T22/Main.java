/**
 *
 * @author Ode
 */

package command_T22;


public class Main {

   
    public static void main(String[] args) {
        
        Valkokangas valkokangas =  new Valkokangas();
        ICommand cmdYlos = new ValkokangasYlos(valkokangas);
        ICommand cmdAlas = new ValkokangasAlas(valkokangas);
        SeinaPainike spYlos = new SeinaPainike(cmdYlos);
        SeinaPainike spAlas = new SeinaPainike(cmdAlas);
        
        spYlos.push();
        spAlas.push();
        spAlas.push();
        spAlas.push();
        spYlos.push();
        spAlas.push();
        
    }

}
