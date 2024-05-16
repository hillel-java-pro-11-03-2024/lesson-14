import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class JewelsInStonesTest {

  @Test
  void numsJewels_shouldCalculate_test1() {
    String jewels = "aA";
    String stones = "aAAbbbb";

    int result = JewelsInStones.numJewelsInStones(jewels, stones);

    Assertions.assertEquals(3, result);
  }

  @Test
  void numsJewels_shouldCalculate_test2() {
    String jewels = "z";
    String stones = "ZZ";

    int result = JewelsInStones.numJewelsInStones(jewels, stones);

    Assertions.assertEquals(0, result);
  }

}
