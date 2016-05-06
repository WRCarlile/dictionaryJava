import org.junit.*;
import static org.junit.Assert.*;

public class DefinitionTest {
  @After
  public void tearDown() {
    Word.clear();
    Definition.clear();
  }

  @Test
  public void word_instantiatesCorrectly_true() {
    Definition testDefinition = new Definition("banana definition");
    assertEquals(true, testDefinition instanceof Definition);
  }
  public void word_wordInstantiatesWithName_Banana() {
    Definition testDefinition = new Definition("banana definition");
    assertEquals("banana definition", testDefinition.getDefinition());
  }

  @Test
  public void all_returnsInstancesOfTheDefinitionArray_true() {
    Definition firstDefinition = new Definition("banana definition");
    Definition secondDefinition = new Definition("apple definition");
    assertTrue(Definition.all().contains(firstDefinition));
    assertTrue(Definition.all().contains(secondDefinition));
  }

  @Test
  public void clear_emptiesAllDefinitionsFromDefinition_0() {
    Definition testDefinition = new Definition("banana definition");
    Definition.clear();
    assertEquals(Definition.all().size(), 0);
  }

  @Test
  public void getId_wordsInstantiateWithAnId_1() {
    Definition testDefinition = new Definition("banana definition");
    assertEquals(1, testDefinition.getId());
  }

  @Test
  public void find_returnsDefinitionWithSameId_secondDefinition() {
    Definition firstDefinition = new Definition("banana definition");
    Definition secondDefinition = new Definition("apple definition");
    assertEquals(Definition.find(secondDefinition.getId()), secondDefinition);
  }

  @Test
  public void find_returnsNullWhenNoDefinitionFound_null() {
    assertTrue(Definition.find(999) == null);
  }
}
