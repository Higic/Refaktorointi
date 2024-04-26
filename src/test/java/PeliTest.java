import Refaktorointi.Peli;
import org.junit.jupiter.api.Test;

/**
 * Testiluokka Refaktorointi.Peli-luokalle.
 *
 * @author Onni Alasaari
 */
public class PeliTest {

    /**
     * Testaa, että pelaa-metodi ei heitä poikkeusta
     */
    @Test
    public void testPelaa() {
        Peli p = new Peli();
        // Testataan, että pelaa-metodi ei heitä poikkeusta
        for (int i = 0; i < 100; i++) {
            p.pelaa();
        }
    }

    /**
     * Testaa, että alusta-metodi ei heitä poikkeusta
     */
    @Test
    public void testAlusta() {
        Peli p = new Peli();
        for (int i = 0; i < 100; i++) {
            p.alusta();
        }
    }

    /**
     * Testaa, että selvitaVoittaja-metodi palauttaa oikean arvon
     */
    @Test
    public void testSelvitaVoittaja() {
        Peli p = new Peli();
        // Testataan, että selvitaVoittaja-metodi palauttaa oikean arvon
        // Refaktorointi.Pelaaja 1 voitot
        assert (p.selvitaVoittaja("kivi", "sakset") == 1);
        assert (p.selvitaVoittaja("paperi", "kivi") == 1);
        assert (p.selvitaVoittaja("sakset", "paperi") == 1);
        // Refaktorointi.Pelaaja 2 voitot
        assert (p.selvitaVoittaja("sakset", "kivi") == 2);
        assert (p.selvitaVoittaja("kivi", "paperi") == 2);
        assert (p.selvitaVoittaja("paperi", "sakset") == 2);
        // Tasapelit
        assert (p.selvitaVoittaja("kivi", "kivi") == 0);
        assert (p.selvitaVoittaja("paperi", "paperi") == 0);
        assert (p.selvitaVoittaja("sakset", "sakset") == 0);
    }
}
