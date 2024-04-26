package Refaktorointi;

/**
 * Refaktorointi.Main-luokka, joka käynnistää pelin.
 *
 * @author Onni Alasaari
 */
public class Main {
    /**
     * Main-metodi, joka käynnistää pelin.
     * @param args komentoriviparametrit
     */
    public static void main(String[] args) {
        Peli p = new Peli();
        p.pelaa();
    }
}
