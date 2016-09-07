import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Anagram {
  public Boolean checkAnagram(String one, String two){
    List<Character> wordOne = new ArrayList<Character>();
    for (char letter : one.toCharArray()) {
      wordOne.add(letter);
    }
    List<Character> wordTwo = new ArrayList<Character>();
    for (char letter : two.toCharArray()) {
      wordTwo.add(letter);
    }
    Collections.sort(wordOne);
    Collections.sort(wordTwo);
      return wordOne.equals(wordTwo);
  }
}
