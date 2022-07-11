public abstract class Breed {
  // Наименование породы
  public void name() {
    
  }
   // Породы котиков
  public enum catBreed {
        RUSSIAN("Русская"), ENGLISH("Английская"), SIAM("Сиамская"), ANGOR("Ангорская");
        private String code;
        catBreed(String code){
            this.code = code;
        }
      
        public static String getCatBreed(int i)  {
            switch (i) {
                case 0:
                    return catBreed.RUSSIAN.code;
                case 1:
                    return catBreed.ENGLISH.code;
                case 2:
                    return catBreed.SIAM.code;
                default:
                    return catBreed.ANGOR.code;
            }
            }
          }
    
  public enum dogBreed {
    SETTER("Сеттер"), BULLDOG("Бульдог"), TERRIER("Терьер"), HUNTER("Охотничья");
    private String code;
    dogBreed(String code){
        this.code = code;
    }
  
    public static String getDogBreed(int i)  {
      switch (i) {
          case 0:
              return dogBreed.SETTER.code;
          case 1:
              return dogBreed.BULLDOG.code;
          case 2:
              return dogBreed.TERRIER.code;
          default:
              return dogBreed.HUNTER.code;
      }

    }
}
 // Цвета
 public enum petColor {
  BLACK("Чёрный"), WHITE("Белый"), GRAY("Серый"), BROWN("Коричневый");
  private String code;
  petColor(String code){
      this.code = code;
  }

  public static String getPetColor(int i)  {
      switch (i) {
          case 0:
              return petColor.BLACK.code;
          case 1:
              return petColor.WHITE.code;
          case 2:
              return petColor.GRAY.code;
          default:
              return petColor.BROWN.code;
      }
      }
    }

  
}
