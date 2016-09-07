import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class AnagramTest {
  Anagram anagramTest = new Anagram();

  @Test
  public void checkAnagram_compareTwoInputs_True() {
    assertEquals(true, anagramTest.checkAnagram("cat", "act"));
  }
}
