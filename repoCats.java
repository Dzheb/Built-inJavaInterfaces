import java.util.ArrayList;
import java.util.Random;

public class repoCats  {
  int num;
  ArrayList<Cat> catRepo;
   
  
  public repoCats(int num, ArrayList<Cat> repo) {
    this.num = num;
    this.catRepo = repo;
  }
  // 
  public ArrayList<Cat> initCats () {
  Random r = new Random();
  for (int i = 0; i < num; i++)  {
      this.catRepo.add(new Cat(PetNames.getCatNames().get(i%4), Breed.catBreed.getCatBreed(i%4), Breed.petColor.getPetColor(i%4), 10 + i, r.nextInt(5, 15)));
    }
    return catRepo;
  }
  
}