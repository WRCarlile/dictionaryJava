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
  public void word_wordInstantiatesWithName_Banana() {
    Word testWord = new Word("Banana");
    assertEquals("Banana", testWord.getWord());
  }

  @Test
  public void all_returnsInstancesOfTheDictionaryArray_true() {
    Word firstWord = new Word("Banana");
    Word secondWord = new Word("Apple");
    assertTrue(Word.all().contains(firstWord));
    assertTrue(Word.all().contains(secondWord));
  }

  @Test
  public void clear_emptiesAllWordsFromDictionary_0() {
    Word testWord = new Word("Banana");
    Word.clear();
    assertEquals(Word.all().size(), 0);
  }
}
