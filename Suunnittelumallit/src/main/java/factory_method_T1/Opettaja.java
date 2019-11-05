package factory_method_T1;

/**
 *
 * @author Ode
 */
public class Opettaja extends AterioivaOtus {
    
    public Juoma createJuoma() {
        return new Vesi();
    }
    
}
