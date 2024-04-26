import Refaktorointi.Main;
import org.junit.jupiter.api.Test;

/**
 * Testiluokka Refaktorointi.Main-luokalle.
 *
 * @author Onni Alasaari
 */
public class MainTest {
    /**
     * Testaa, että main-metodi ei heitä poikkeusta
     */
    @Test
    public void testMain() {
        Main.main(new String[0]);
    }
}
