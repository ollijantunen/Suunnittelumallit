package command_T22;

/**
 *
 * @author Ode
 */

// Receiver
class Valkokangas {
    private boolean ylhaalla = false;

    void ylos() {
        ylhaalla = true;
        System.out.println(this);
    }

    void alas() {
        ylhaalla = false;
        System.out.println(this);
    }
    
    @Override
    public String toString() {
        return "Valkokangas on " + (ylhaalla ? "ylhäällä" : "alhaalla") + ".";
    }

}
