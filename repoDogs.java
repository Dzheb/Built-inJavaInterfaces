import java.util.ArrayList;
import java.util.Random;

public class repoDogs {
  int num;
  ArrayList<Dog> dogRepo;

  public repoDogs(int num, ArrayList<Dog> repo) {
    this.num = num;
    this.dogRepo = repo;
  }

  //
  public ArrayList<Dog> initDogs() {
    Random r = new Random();
    for (int i = 0; i < num; i++) {
      this.dogRepo.add(new Dog(PetNames.getDogNames().get(i % 4), Dog.dogBreed.getDogBreed(i % 4),
          Breed.petColor.getPetColor(i % 4), 3 + i, r.nextInt(3, 18)));
    }
    return dogRepo;
  }

}