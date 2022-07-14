package sing.app;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    void shouldAnswerWithTrue() {
        App m = new App();
        assertNotNull(m);
    }

    /**
     * Test CLI
     */

    @Test
    void testMain() {
        App.main(null);
        assertTrue(true);
    }
}
