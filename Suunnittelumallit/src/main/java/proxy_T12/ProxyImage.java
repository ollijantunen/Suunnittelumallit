package proxy_T12;

/**
 *
 * @author Ode
 */
public class ProxyImage implements IImage {

    private final String filename;
    private RealImage image;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void showData() {
        System.out.println(filename);
    }

    /**
     * Displays the image
     */
    @Override
    public void displayImage() {
        if (image == null) {
            image = new RealImage(filename);
        }
        image.displayImage();
    }

}
