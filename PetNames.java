import java.util.ArrayList;

public abstract class PetNames {
  public static ArrayList<String> getCatNames() {
    ArrayList<String> catNames = new ArrayList<>();
    catNames.add("Барсик");
    catNames.add("Пират");
    catNames.add("Пушок");
    catNames.add("Васька");
    return catNames;
  }

  public static ArrayList<String> getDogNames() {
    ArrayList<String> dogNames = new ArrayList<>();
    dogNames.add("Барбос");
    dogNames.add("Бобик");
    dogNames.add("Шарик");
    dogNames.add("Мухтар");
    return dogNames;
  }

}
