import java.util.ArrayList;

public class Define {
  private String mDefine;
  private static ArrayList<Define> definition = new ArrayList<Define>();
  private int mId;

	public Define(String word) {
		mDefine = word;
    definition.add(this);
    mId = definition.size();
	}

	public String getDefine() {
		return mDefine;
	}

  public static ArrayList<Define> all() {
    return definition;
  }


  public static void clear() {
    definition.clear();
  }

  public int getId() {
    return mId;
  }

  public static Define find(int id) {
    try {
      return definition.get(id - 1);
    } catch (IndexOutOfBoundsException e) {
      return null;
    }
  }
}
