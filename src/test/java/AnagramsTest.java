import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class AnagramsTest {
  @Test
  public void runAmagrams_receiveInput() {
    Anagrams anagramsTest = new Anagrams();
    ArrayList<String> expected = new ArrayList<String>();
    assertEquals(true, anagramsTest.runAnagrams("cat", "act"));
  }

}
