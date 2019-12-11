package chain_of_responsibility_T10;

/**
 *
 * @author Ode
 */
public class Paallikko extends AsemaHandler {

    private final double MAX = 5.00;

    @Override
    public void kasittelePyynto(double prosentti) {
        if (prosentti >= MAX && asema != null) {
            asema.kasittelePyynto(prosentti);
        } else {
            System.out.println("Päällikkö hyväksyy " + prosentti + "% palkankorotuksen.");
        }

    }

}
