package composite_T3;

import java.util.ArrayList;

/**
 *
 * @author Ode
 */
public class Tietokone implements ILaiteOsa {
    private String nimi;
    private int hinta;
    private ArrayList<ILaiteOsa> koostuu = new ArrayList<>();
    
    public Tietokone (String nimi) {
        this.nimi = nimi;
    }

    @Override
    public void addLaiteOsa(ILaiteOsa laiteOsa) {
        koostuu.add(laiteOsa);
    }

    @Override
    public int getHinta() {
        int yhteensa = this.hinta;
        for (ILaiteOsa osa : koostuu) {
            yhteensa += osa.getHinta();
        }
        return yhteensa;
    }
    
    @Override
    public String toString() {
        String sisalto = nimi + " sisältää seuraavat osat:";
        for (ILaiteOsa osa : koostuu) {
            sisalto += "\n" + osa.toString();
        }        
        sisalto += "\n\nTietokoneen hinta on " + this.getHinta() + " euroa.";
                
        return sisalto;
    }
    
}
