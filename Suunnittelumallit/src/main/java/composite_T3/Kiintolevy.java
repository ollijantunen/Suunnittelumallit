package composite_T3;

/**
 *
 * @author Ode
 */
public class Kiintolevy implements ILaiteOsa {
    private String nimi = "Kiintolevy";
    private String valmistaja;
    private int hinta;

    public Kiintolevy(String valmistaja, int hinta) {
        this.valmistaja = valmistaja;
        this.hinta = hinta;
    }

    @Override
    public void addLaiteOsa(ILaiteOsa laiteOsa) {
        throw new RuntimeException("Kiintolevyyn ei voi lisätä muita laiteosia.");
    }

    @Override
    public int getHinta() {
        return this.hinta;
    }

    @Override
    public String toString() {
        String sisalto = this.nimi + ": Valmistaja " + this.valmistaja + ", hinta " + this.hinta + " euroa.";
        return sisalto;
    }
}
