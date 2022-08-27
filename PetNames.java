import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class PetNames {
  private PetNames() {
  }

  public static ArrayList<String> getCatNames() {
    ArrayList<String> catNames = new ArrayList<>(Arrays.asList("Барсик","Пират","Пушок","Васька"));
    return catNames;
  }

  public static ArrayList<String> getDogNames() {
    // ArrayList<String> dogNames = new ArrayList<>();
    ArrayList<String> dogNames = new ArrayList<>(Arrays.asList("Барбос",
    "Бобик","Шарик","Мухтар"));
    return dogNames;
  }

}
