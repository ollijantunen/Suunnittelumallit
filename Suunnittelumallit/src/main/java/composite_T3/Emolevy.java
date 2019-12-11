package composite_T3;

import java.util.ArrayList;

/**
 *
 * @author Ode
 */
public class Emolevy implements ILaiteOsa {
    private String nimi = "Emolevy";
    private String valmistaja;
    private int hinta;
    private ArrayList<ILaiteOsa> koostuu = new ArrayList<>();
    
    public Emolevy (String valmistaja, int hinta) {
        this.valmistaja = valmistaja;
        this.hinta = hinta;
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
        String sisalto = this.nimi + ": Valmistaja "+ this.valmistaja + ", hinta " + this.hinta + " euroa.";
        for (ILaiteOsa osa : koostuu) {
            sisalto += "\n--" + osa.toString();
        }
        return sisalto;
    }    
}
