package template_T8;

import java.util.Random;

/**
 *
 * @author Ode
 */
public class Teikkaus extends GameTemplate {
    private int teikkausMäärä, oikeinP1, oikeinP2;
    private boolean teikkaus, arvausP;
    private Random random;

    @Override
    void initializeGame() {
        teikkausMäärä = 0;
        oikeinP1 = 0;
        oikeinP2 = 0;
        random = new Random();
        
        System.out.println("Peli on ladattu");
    }

    @Override
    void makePlay(int player) {
        player++;
        arvausP = random.nextBoolean();

        if (arvausP == true) {
            System.out.println("Pelaaja " + player + " arvaa: kruuna.");
        } else {
            System.out.println("Pelaaja " + player + " arvaa: klaava.");
        }

        System.out.println("Suoritetaan teikkaus");
        teikkaus = random.nextBoolean();
        teikkausMäärä++;

        if (teikkaus == arvausP) {
            System.out.println("Kruuna. Pelaaja " + player + " arvasi oikein.\n");
            if (player == 1) {
                oikeinP1++;
            } else {
                oikeinP2++;
            }
        } else {
            System.out.println("Klaava. Pelaaja " + player + " arvasi väärin.\n");
        }
    }

    @Override
    boolean endOfGame() {
        int loppu = 20;
        if (oikeinP1 < loppu && oikeinP2 < loppu) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    void printWinner() {
        System.out.println("Teikattiin: " + teikkausMäärä + " kertaa."
                + "\nPelaaja 1 arvattu oikein " + oikeinP1 + " kertaa. "
                + "\nPelaaja 2 arvasi oikein " + oikeinP2 + " kertaa.\n");
        if (oikeinP1 > oikeinP2) {
            System.out.println("Pelaaja 1 voitti.");
        } else {
            System.out.println("Pelaaja 2 voitti.");
        }
    }
}
