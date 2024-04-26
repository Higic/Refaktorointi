package Refaktorointi;

/**
 * Pelaaja-luokka, jossa on pelaajan toiminnot.
 *
 * @author Onni Alasaari
 */
public class Pelaaja {

    private int voitot;

    /**
     * Konstruktori Refaktorointi.Pelaaja-luokalle
     */
    public Pelaaja() {
        this.voitot = 0;
    }

    /**
     * Metodi, joka valitsee luvun 0-2 ja palauttaa sen perusteella arvon "kivi", "paperi" tai "sakset"
     *
     * @return valinta, arvo "kivi", "paperi" tai "sakset"
     */
    public String valitse() {
        int pick = (int) (Math.random() * 3);
        return switch (pick) {
            case 0 -> "kivi";
            case 1 -> "paperi";
            default -> "kivi";
        };
    }

    /**
     * Metodi, joka palauttaa voittojen lukumäärän
     *
     * @return voitot, kyseisen pelaajan voittojen lukumäärä
     */
    public int getVoitot() {
        return voitot;
    }

    /**
     * Metodi, joka asettaa voittojen lukumäärän
     *
     * @param voitot, voittojen lukumäärä
     */
    public void setVoitot(int voitot) {
        this.voitot = voitot;
    }

    /**
     * Metodi, joka kasvattaa voittojen lukumäärää yhdellä
     */
    public void voita() {
        setVoitot(getVoitot() + 1);
    }
}
