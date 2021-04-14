import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/*
 * Testing strategy
 *
 * Consider the follwing test classes:
 * a < b, a > 0, b > 0
 * a > b, a < 0, b < 0
 * (0, 0) covers a = b, a = 0, b = 0
 * a < b, a = minint, b = maxint
 * a > b, a = maxint, b = minint
 *
 * Coverage strategy: Cover each test class
 *                    with one test value.
 */

class MathTest {

  // covers a < b, a > 0, b > 0
  @Test
  public void testALessThanBAndBothPositive() {
    assertEquals(2, Math.max(1, 2));
  }

  // covers a > b, a < 0, b < 0
  @Test
  public void testAGreaterThanBAndBothNegative() {
    assertEquals(-1, Math.max(-1, -3));
  }

  // covers a = b, a = 0, b = 0
  @Test
  public void testBothEqualAndZero() {
    assertEquals(0, Math.max(0, 0));
  }

  // covers a < b, a = minint, b = maxint
  @Test
  public void testALessThanBAminAndBmax(){
    int a=Integer.MIN_VALUE;
    int b=Integer.MAX_VALUE;
    int actual= Math.max(a,b);
    int expected= Integer.MAX_VALUE;
    assertEquals(expected, actual );
  }

  // covers a > b, a = maxint, b = minint
  @Test
  public void testAGreaterThanBAmaxAndBmin(){
    int a= Integer.MAX_VALUE;
    int b= Integer.MIN_VALUE;
    int actual= Math.max(a,b);
    int expected= Integer.MAX_VALUE;
    assertEquals(expected, actual);




  }


}
