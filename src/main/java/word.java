import java.util.ArrayList;

public class Word {
  private String mWord;
  private static ArrayList<Word> dictionary = new ArrayList<Word>();
  private int mId;
  private ArrayList<Define> mDefinitions;

	public Word(String word) {
		mWord = word;
    dictionary.add(this);
    mId = dictionary.size();
    mDefinitions = new ArrayList<Define>();
	}

	public String getWord() {
		return mWord;
	}

  public static ArrayList<Word> all() {
    return dictionary;
  }
  public ArrayList<Define> getDefinitions() {
      return mDefinitions;
    }

  public static void clear() {
    dictionary.clear();
  }

  public int getId() {
    return mId;
  }
  public void addDefine(Define define) {
  mDefinitions.add(define);
}

  public static Word find(int id) {
    try {
      return dictionary.get(id - 1);
    } catch (IndexOutOfBoundsException e) {
      return null;
    }


  }
}
