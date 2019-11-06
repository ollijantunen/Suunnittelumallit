package factory_method_T1;

/**
 *
 * @author Ode
 */

// ConcreteCreator
public class Vahtimestari extends AterioivaOtus {
    
    @Override
    public Juoma createJuoma() {
        return new Mehu();
    }
    
    @Override
    public Ruoka createRuoka() {
        return new Hampurilainen();
    }
    
}
