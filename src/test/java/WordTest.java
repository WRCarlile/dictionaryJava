import org.junit.*;
import static org.junit.Assert.*;

public class WordTest {
  // @After
  // public void tearDown() {
  //   Word.clear();
  //   Define.clear();
  // }

  @Test
  public void word_instantiatesCorrectly_true() {
    Word testWord = new Word("Banana");
    assertEquals(true, testWord instanceof Word);
  }
  public void word_wordInstantiaesWithName_Banana() {
    Word testWord = new Word("Banana");
    assertEquals("Banana", testWord.getWord());
  }
}
