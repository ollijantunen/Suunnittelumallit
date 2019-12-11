package chain_of_responsibility_T10;

/**
 *
 * @author Ode
 */
public abstract class AsemaHandler {
    protected AsemaHandler asema;

    public void setSuccessorAsema(AsemaHandler asema) {
        this.asema = asema;
    }

    abstract public void kasittelePyynto(double prosentti);
}
