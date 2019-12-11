package abstract_factory_T2;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author Ode
 */
public class Main {
    
    public static void main(String[] args) {
        Henkilo jasper = new Henkilo("Jasper");
        
        jasper.pueVaatteet(new ConcreteFactoryAdidas());
        jasper.kerroVaatteet();
        
        System.out.println("\nJasper valmistui.\n");
        
        jasper.pueVaatteet(new ConcreteFactoryBoss());
        jasper.kerroVaatteet();
        
    }
    
}
