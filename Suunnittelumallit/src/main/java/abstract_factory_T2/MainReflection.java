/**
 *
 * @author Ode
 */

package abstract_factory_T2;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;


public class MainReflection {

    public static void main(String[] args) {
        
        Class c = null;
        IAbstractFactory factory1 = null;
        IAbstractFactory factory2 = null;
        
        Properties properties = new Properties();
        
        try {
            properties.load(new FileInputStream("src/main/java/abstract_factory_T2/factory.properties"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        try {
            c = Class.forName(properties.getProperty("factory1"));
            factory1 = (IAbstractFactory) c.newInstance();
            c = Class.forName(properties.getProperty("factory2"));
            factory2 = (IAbstractFactory) c.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        Henkilo opiskelevaJasper = new Henkilo("Opiskeleva Jasper");
        Henkilo valmistunutJasper = new Henkilo("Valmistunut Jasper");
        
        opiskelevaJasper.pueVaatteet(factory1);
        opiskelevaJasper.kerroVaatteet();
        
        System.out.println("\nJasper valmistui.\n");
        
        valmistunutJasper.pueVaatteet(factory2);
        valmistunutJasper.kerroVaatteet();
    }

}
