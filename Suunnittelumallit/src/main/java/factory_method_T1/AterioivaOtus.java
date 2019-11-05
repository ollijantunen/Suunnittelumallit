package factory_method_T1;

/**
 *
 * @author Ode
 */
public abstract class AterioivaOtus {
    Juoma juoma = null;
    
    public abstract Juoma createJuoma();
    
    public void aterioi() {
        syo();
        juo();
    }
    
    public void syo() {
        System.out.println("Kylläpä ruoka maistuukin hyvältä!");
    }
    
    public void juo() {
        if (juoma == null) {
            juoma = createJuoma();            
        }
        System.out.println("Aterian jälkeen " + juoma + " tekee terää!");
    }
}
