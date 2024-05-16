import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GoodPairsTest {

  @Test
  void findGoodPairs_shouldCalc_test1() {
    int[] source = {1,2,3,1,1,3};

    int result = GoodPairs.numIdenticalPairs(source);

    Assertions.assertEquals(4, result);
  }

  @Test
  void findGoodPairs_shouldCalc_test2() {
    int[] source = {1,1,1,1};

    int result = GoodPairs.numIdenticalPairs(source);

    Assertions.assertEquals(6, result);
  }

}
