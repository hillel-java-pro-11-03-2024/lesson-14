import java.util.HashMap;
import java.util.Map;

public class BalloonsNumber {

  private static final String word = "balloon";

  public static int maxNumberOfBalloons(String text) {
    Map<Character, Integer> charCount = new HashMap<>();
    for (char ch : word.toCharArray()) {
      charCount.put(ch, 0);
    }

    for (char ch : text.toCharArray()) {
      if (charCount.containsKey(ch)) {
        charCount.put(ch, charCount.get(ch) + 1);
      }
    }

    int bCount = charCount.getOrDefault('b', 0);
    int aCount = charCount.getOrDefault('a', 0);
    int lCount = charCount.getOrDefault('l', 0) / 2;
    int oCount = charCount.getOrDefault('o', 0) / 2;
    int nCount = charCount.getOrDefault('n', 0);
    return (bCount + aCount + lCount + oCount + nCount) / 5;
  }

}
