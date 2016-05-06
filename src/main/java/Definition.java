import java.util.ArrayList;

public class Definition {
  private String mDefinition;
  private static ArrayList<Definition> definition = new ArrayList<Definition>();
  private int mId;

	public Definition(String word) {
		mDefinition = word;
    definition.add(this);
    mId = definition.size();
	}

	public String getDefinition() {
		return mDefinition;
	}

  public static ArrayList<Definition> all() {
    return definition;
  }


  public static void clear() {
    definition.clear();
  }

  public int getId() {
    return mId;
  }

  public static Definition find(int id) {
    try {
      return definition.get(id - 1);
    } catch (IndexOutOfBoundsException e) {
      return null;
    }
  }
}
