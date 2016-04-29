import java.util.ArrayList;

public class Category {
  private String mName;
  private static ArrayList<Category> instances = new ArrayList<Category>();
  private int mId;
  private ArrayList<Task> mTasks;
}
