import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class AnagramsTest {

  @Test
  public void runAmagrams_outputArray() {
    Anagrams anagramsTest = new Anagrams();
    ArrayList<String> expected = new ArrayList<String>();
    expected.add("cat");
    expected.add("act");
    assertEquals(expected, anagramsTest.runAnagrams("cat act"));
  }

  @Test
  public void runAmagrams_outputArray() {
    Anagrams anagramsTest = new Anagrams();
    ArrayList<String> expected = new ArrayList<String>();
    expected.add("cat");
    expected.add("act");
    assertEquals(expected, anagramsTest.runAnagrams("cat act"));
  }
}
