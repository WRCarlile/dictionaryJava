import org.junit.*;
import static org.junit.Assert.*;

public class DefineTest {
  @After
  public void tearDown() {
    Word.clear();
    Define.clear();
  }

  @Test
  public void word_instantiatesCorrectly_true() {
    Define testDefine = new Define("banana definition");
    assertEquals(true, testDefine instanceof Define);
  }
  public void word_wordInstantiatesWithName_Banana() {
    Define testDefine = new Define("banana definition");
    assertEquals("banana definition", testDefine.getDefine());
  }

  @Test
  public void all_returnsInstancesOfTheDefinitionArray_true() {
    Define firstDefine = new Define("banana definition");
    Define secondDefine = new Define("apple definition");
    assertTrue(Define.all().contains(firstDefine));
    assertTrue(Define.all().contains(secondDefine));
  }

  @Test
  public void clear_emptiesAllDefinesFromDefinition_0() {
    Define testDefine = new Define("banana definition");
    Define.clear();
    assertEquals(Define.all().size(), 0);
  }

  @Test
  public void getId_wordsInstantiateWithAnId_1() {
    Define testDefine = new Define("banana definition");
    assertEquals(1, testDefine.getId());
  }

  @Test
  public void find_returnsDefineWithSameId_secondDefine() {
    Define firstDefine = new Define("banana definition");
    Define secondDefine = new Define("apple definition");
    assertEquals(Define.find(secondDefine.getId()), secondDefine);
  }

  @Test
  public void find_returnsNullWhenNoDefineFound_null() {
    assertTrue(Define.find(999) == null);
  }
}
