package command_T22;

/**
 *
 * @author Ode
 */
public class ValkokangasAlas implements ICommand {
    private Valkokangas valkokangas;

    public ValkokangasAlas(Valkokangas valkokangas) {
        this.valkokangas = valkokangas;
    }
    
    @Override
    public void execute() {
        valkokangas.alas();
    }
    
}
