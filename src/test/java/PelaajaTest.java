import Refaktorointi.Pelaaja;
import org.junit.jupiter.api.Test;

/**
 * Testiluokka Refaktorointi.Pelaaja-luokalle.
 *
 * @author Onni Alasaari
 */
public class PelaajaTest {

    /**
     * Testaa, että valitse-metodi palauttaa aina joko "kivi", "paperi" tai "sakset"
     */
    @Test
    public void testValitse() {
        Pelaaja pelaaja = new Pelaaja();
        // Testataan, että pelaaja valitsee aina joko kiven, paperin tai sakset
        for (int i = 0; i < 100; i++) {
            String valinta = pelaaja.valitse();
            assert(valinta.equals("kivi") || valinta.equals("paperi") || valinta.equals("sakset"));
        }
    }

    /**
     * Testaa, että voita-metodi kasvattaa voittojen lukumäärää yhdellä
     */
    @Test
    public void testVoita() {
        Pelaaja pelaaja = new Pelaaja();
        pelaaja.voita();
        assert(pelaaja.getVoitot() == 1);
        for (int i = 0; i < 3; i++) {
            pelaaja.voita();
        }
        assert(pelaaja.getVoitot() == 4);
    }
}
