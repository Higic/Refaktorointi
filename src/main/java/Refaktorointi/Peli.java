package Refaktorointi;

/**
 * Refaktorointi.Peli-luokka, jossa on pelin logiikan.
 *
 * @author Onni Alasaari
 */
public class Peli {

    /**
     * Voittojen maksimimäärä, tätä muuttaessa voi nostaa kierroksien määrää.
     */
    public final static int VOITTO_MAX = 3;

    private boolean peliLoppu = false;  // Arvo, jonka perusteella peli loppuu
    private int erat = 1;               // Erien lukumäärä
    private int tasapelit = 0;          // Tasapelien lukumäärä
    private Pelaaja p1;                 // Pelaaja 1
    private Pelaaja p2;                 // Pelaaja 2


    /**
     * Metodi, jossa on pelin logiikan.
     */
    public void pelaa() {
        System.out.println("Tervetuloa simuloituun Kivi-Paperi-Sakset -peliin!\n");
        alusta();

        // Pelataan niin kauan, kunnes jompikumpi pelaajista saavuttaa 3 voittoa
        while (!peliLoppu) {
            System.out.println("\nErä " + erat + ":");
            // Pelaajat valitsevat liikkeensä
            // Pelaajan 1 valinta
            String p1Valinta = p1.valitse();
            // Pelaajan 2 valinta
            String p2Valinta = p2.valitse();
            System.out.println("Refaktorointi.Pelaaja 1: " + p1Valinta);
            System.out.println("Refaktorointi.Pelaaja 2: " + p2Valinta);

            // Selvitetään voittaja
            int lopputulos = selvitaVoittaja(p1Valinta, p2Valinta);
            switch (lopputulos) {
                case 0:
                    System.out.println("Tasapeli!");
                    tasapelit++;
                    break;
                case 1:
                    System.out.println("Refaktorointi.Pelaaja 1 voittaa!");
                    p1.voita();
                    break;

                case 2:
                    System.out.println("Refaktorointi.Pelaaja 2 voittaa!");
                    p2.voita();
                    break;
            }

            erat++;

            // Refaktorointi.Peli päättyy, kun jompikumpi pelaajista saavuttaa 3 voittoa
            if (p1.getVoitot() == VOITTO_MAX || p2.getVoitot() == VOITTO_MAX) {
                System.out.println("\n\nRefaktorointi.Peli päättyi!");
                System.out.println("Refaktorointi.Pelaaja 1 voitti " + p1.getVoitot() + " kertaa.");
                System.out.println("Refaktorointi.Pelaaja 2 voitti " + p2.getVoitot() + " kertaa.");
                System.out.println("Tasapelejä oli " + tasapelit + " kpl.");
                // Tulostetaan voittaja
                if (p1.getVoitot() == VOITTO_MAX)
                    System.out.println("Refaktorointi.Pelaaja 1 voitti pelin!");
                else
                    System.out.println("Refaktorointi.Pelaaja 2 voitti pelin!");
                peliLoppu = true;
            }
        }
    }

    /**
     * Metodi, joka alustaa pelin tarvittaessa nollatilanteeseen.
     */
    public void alusta() {
        p1 = new Pelaaja();
        p2 = new Pelaaja();
        peliLoppu = false;
        erat = 1;
        tasapelit = 0;
    }

    /**
     * Metodi, joka selvittää voittajan.
     *
     * @param p1 Pelaajan 1 valinta
     * @param p2 Pelaajan 2 valinta
     * @return 0, jos tasapeli, 1, jos pelaaja 1 voittaa, 2, jos pelaaja 2 voittaa
     */
    public int selvitaVoittaja(String p1, String p2) {

        return switch (p1) {
            case "kivi" -> switch (p2) {
                case "paperi" -> 2;
                case "sakset" -> 1;
                default -> 0;
            };
            case "paperi" -> switch (p2) {
                case "kivi" -> 1;
                case "sakset" -> 2;
                default -> 0;
            };
            // Jos pelaaja 1 valitsi sakset
            default -> switch (p2) {
                case "kivi" -> 2;
                case "paperi" -> 1;
                default -> 0;
            };
        };
    }
}