import java.util.ArrayList;

public class Word {
  private String mWord;
  private static ArrayList<Word> dictionary = new ArrayList<Word>();
  private int mId;

	public Word(String word) {
		mWord = word;
    dictionary.add(this);
    mId = dictionary.size();
	}

	public String getWord() {
		return mWord;
	}

  public static ArrayList<Word> all() {
    return dictionary;
  }


  public static void clear() {
    dictionary.clear();
  }

  public int getId() {
    return mId;
  }

  public static Word find(int id) {
    try {
      return dictionary.get(id - 1);
    } catch (IndexOutOfBoundsException e) {
      return null;
    }
  }
}
