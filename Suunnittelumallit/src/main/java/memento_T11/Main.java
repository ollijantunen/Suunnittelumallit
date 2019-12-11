package memento_T11;

import java.util.Random;

/**
 *
 * @author Ode
 */

public class Main {
    static int id = 0;

    public static void main(String[] args) {

        Arvuuttaja arpapeli = new Arvuuttaja();
        Random r = new Random();

        //luodaan runnable asiakas
        Runnable asiakas = () -> {

            int rid = id++;
            Object memento;
            boolean tarkistus = false;
            int arvaus = 0;
            int kierrokset = 0;

            memento = arpapeli.liityPeliin();

            while (!tarkistus) {
                kierrokset++;
                arvaus = r.nextInt(10) + 1;
                tarkistus = arpapeli.tarkistus(memento, arvaus);
            }

            System.out.println("'Asiakas' " + rid + " arvasi oikein. Vastaus oli " + arvaus + ". Peli kesti " + kierrokset + " kierrosta.");
        };

        //luodaan peliä pelaavat säikeet
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(asiakas);
            thread.start();
        }

        System.out.println("Tehty!");
    }
}
