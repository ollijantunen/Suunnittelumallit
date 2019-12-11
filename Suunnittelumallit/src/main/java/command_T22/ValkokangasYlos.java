package command_T22;

/**
 *
 * @author Ode
 */
public class ValkokangasYlos implements ICommand {
    private Valkokangas valkokangas;
    
    public ValkokangasYlos (Valkokangas valkokangas) {
        this.valkokangas = valkokangas;
    }

    @Override
    public void execute() {
        valkokangas.ylos();
    }
    
}
