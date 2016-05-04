import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import static org.assertj.core.api.Assertions.assertThat;
import static org.fluentlenium.core.filter.FilterConstructor.*;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
    return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

	@Test
	  public void rootTest() {
	    goTo("http://localhost:4567/");
	    assertThat(pageSource()).contains("DIY Dictionary");
  }
	@Test
	public void wordIsCreatedTest() {
	  goTo("http://localhost:4567/");
	  click("a", withText("Add a New Word"));
	  fill("#word").with("Banana");
	  submit(".btn");
	  assertThat(pageSource()).contains("Your word has been saved to the dictionary.");
	}
	@Test
	public void dictionaryShowPageDisplaysWord() {
	  goTo("http://localhost:4567/dictionary/new");
	  fill("#word").with("Banana");
	  submit(".btn");
	  click("a", withText("View Dictionary"));
	  click("a", withText("Banana"));
	  assertThat(pageSource()).contains("Banana");
	}
  @Test
    public void goesToDefinitionPage() {
      goTo("http://localhost:4567/");
      click("a", withText("Add a New Word"));
      fill("#word").with("Banana");
      submit(".btn");
      click("a", withText("View Dictionary"));
      assertThat(pageSource()).contains("Banana");
      click("a", withText("Banana"));
      click("a", withText("Add a new definition"));
      assertThat(pageSource()).contains("Add a definition to Banana");
    }
  }
}
