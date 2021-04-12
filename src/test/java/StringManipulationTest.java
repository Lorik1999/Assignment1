import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/*
 * Testing strategy
 *
 * Partition the inputs as follows:
 * text.length(): 0, 1, > 1
 * start:         0, 1, 1 < start < text.length() - 1,
 *                text.length() - 1, text.length()
 * text.length()-start: 0, 1, even > 1, odd > 1
 *
 * Include even- and odd-length reversals because
 * only odd has a middle element that doesn't move.
 *
 * Exhaustive Cartesian coverage of partitions.
 */

class StringManipulationTest {

   // covers text.length() = 0,
  //        start = 0 = text.length(),
  //        text.length()-start = 0
  @Test public void testEmpty() {
      assertEquals("", StringManipulation.reverseEnd("", 0));
  }

  // TODO

}
