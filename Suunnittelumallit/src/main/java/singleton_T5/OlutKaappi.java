package singleton_T5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Ode
 */
public class OlutKaappi {
    private static OlutKaappi INSTANCE = null;
    
    private static String[] oluet = {"IPA", "Lager", "APA", "Vehnä", "Sour", "Pilsner", "Stout"};
    
    private ArrayList<String> olutKaappi = new ArrayList<>(Arrays.asList(oluet));
    
    private OlutKaappi() {
        
    }
    
    public static synchronized OlutKaappi getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new OlutKaappi();
            Collections.shuffle(INSTANCE.olutKaappi);
        }
        return INSTANCE;
    }
    
    public ArrayList<String> getOlutKaappi() {
        return INSTANCE.olutKaappi;
    }
    
    public ArrayList<String> getOlut(int lukuMaara) {
        ArrayList<String> juodutOluet = new ArrayList<>();
        for ( int i = 0 ; i < lukuMaara ; i++) {
            juodutOluet.add(INSTANCE.olutKaappi.remove(0));
        }
        return juodutOluet;
    }
    
    public void ostaOluet(ArrayList<String> oluet) {
            INSTANCE.olutKaappi.addAll(oluet);
    }
}
