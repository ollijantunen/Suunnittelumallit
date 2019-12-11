package composite_T3;

import java.util.ArrayList;

/**
 *
 * @author Ode
 */
public class Tuuletin implements ILaiteOsa {
    private String nimi = "Tuuletin";
    private String valmistaja;
    private int hinta; 
    
    public Tuuletin (String valmistaja, int hinta) {
        this.valmistaja = valmistaja;
        this.hinta = hinta;
    }

    @Override
    public void addLaiteOsa(ILaiteOsa laiteOsa) {
        throw new RuntimeException("Tuulettimeen ei voi lisätä muita laiteosia.");
    }

    @Override
    public int getHinta() {
        return this.hinta;
    }
    
    @Override
    public String toString() {
        String sisalto = this.nimi + ": Valmistaja "+ this.valmistaja + ", hinta " + this.hinta + " euroa.";
        return sisalto;
    } 
}
