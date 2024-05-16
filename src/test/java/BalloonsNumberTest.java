import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BalloonsNumberTest {

  @Test
  void calculateBalloons_shouldCalculate_test1() {
    String text = "nlaebolko";

    int result = BalloonsNumber.maxNumberOfBalloons(text);

    Assertions.assertEquals(1, result);
  }

  @Test
  void calculateBalloons_shouldCalculate_test2() {
    String text = "loonbalxballpoon";

    int result = BalloonsNumber.maxNumberOfBalloons(text);

    Assertions.assertEquals(2, result);
  }

}
