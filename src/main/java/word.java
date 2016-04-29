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








}
