package sing.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppleTest {
  @Test
  void testSize() {
    Apple a = new Apple();
    assertEquals(a.size(3), 8);
  }

  @Test
  void testSize2() {
    Apple a = new Apple();
    assertEquals(a.size(4), 10);
  }
}
