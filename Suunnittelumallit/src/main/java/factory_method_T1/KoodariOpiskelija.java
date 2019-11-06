package factory_method_T1;

/**
 *
 * @author Ode
 */

// ConcreteCreator
public class KoodariOpiskelija extends AterioivaOtus {
    
        @Override
    public Juoma createJuoma() {
        return new Kahvi();
    }
    
    @Override
    public Ruoka createRuoka() {
        return new Munkki();
    }
    
}
