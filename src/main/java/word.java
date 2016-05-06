import java.util.ArrayList;

public class Word {
  private String mWord;
  private static ArrayList<Word> dictionary = new ArrayList<Word>();
  private int mId;
  private ArrayList<Definition> mDefinitions;

	public Word(String word) {
		mWord = word;
    dictionary.add(this);
    mId = dictionary.size();
    mDefinitions = new ArrayList<Definition>();
	}

	public String getWord() {
		return mWord;
	}

  public static ArrayList<Word> all() {
    return dictionary;
  }
  public ArrayList<Definition> getDefinitions() {
      return mDefinitions;
  }

  public static void clear() {
    dictionary.clear();
  }

  public int getId() {
    return mId;
  }

  public void addDefinition(Definition definition) {
    mDefinitions.add(definition);
  }

  public static Word find(int id) {
    try {
      return dictionary.get(id - 1);
    } catch (IndexOutOfBoundsException e) {
      return null;
    }
  }
}
