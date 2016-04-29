import org.junit.*;
import static org.junit.Assert.*;

public class WordTest {
  @After
  public void tearDown() {
    Word.clear();
    // Define.clear();
  }

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

  @Test
  public void getId_wordsInstantiateWithAnId_1() {
    Word testWord = new Word("Banana");
    assertEquals(1, testWord.getId());
  }

  @Test
  public void find_returnsWordWithSameId_secondWord() {
    Word firstWord = new Word("Banana");
    Word secondWord = new Word("Apple");
    assertEquals(Word.find(secondWord.getId()), secondWord);
  }

  @Test
  public void find_returnsNullWhenNoWordFound_null() {
    assertTrue(Word.find(999) == null);
  }
}
