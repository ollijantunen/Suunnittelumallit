/**
 *
 * @author Ode
 */

package proxy_T12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        IImage image1 = new ProxyImage("20MB_Photo1");
        IImage image2 = new ProxyImage("40MB_Photo2");
        IImage image3 = new ProxyImage("52MB_Photo3");

        List<IImage> images = new ArrayList<>();
        images.add(image1);
        images.add(image2);
        images.add(image3);

        Scanner scanner = new Scanner(System.in);
        int select = -1;

        while (select != 0) {
            System.out.println("Select a file number to open. Select 0 to quit program.");

            for (int i = 0; i < images.size(); i++) {
                System.out.print(i + 1 + "\t");
                images.get(i).showData();
            }

            try {
                select = Integer.parseInt(scanner.nextLine());
                if (select != 0) {
                    images.get(select - 1).displayImage();
                    System.out.println("");
                }
            } catch (IndexOutOfBoundsException iobe) {
                select = -1;
                System.out.println("Image not found\n");
            } catch (Exception e) {
                select = -1;
                System.out.println("Invalid selection\n");
            }
        }
        System.out.println("Thank you!");
    }
}
