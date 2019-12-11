package proxy_T12;

/**
 *
 * @author Ode
 */
public class RealImage implements IImage {
    private final String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadImageFromDisk();
    }

    private void loadImageFromDisk() {
        System.out.println("Loading    " + filename);
    }

    @Override
    public void showData() {
        System.out.println(filename);
    }

    @Override
    public void displayImage() {
        System.out.println("Displaying " + filename);
    }
}
