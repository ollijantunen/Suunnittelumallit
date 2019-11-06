package factory_method_T1;

/**
 *
 * @author Ode
 */

// ConcreteCreator
public class Opettaja extends AterioivaOtus {
    
    @Override
    public Juoma createJuoma() {
        return new Vesi();
    }
    
    @Override
    public Ruoka createRuoka() {
        return new Hampurilainen();
    }
    
}
