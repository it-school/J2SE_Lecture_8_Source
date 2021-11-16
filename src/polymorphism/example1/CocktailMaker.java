package polymorphism.example1;

public class CocktailMaker extends DrinkProducer {
   public CocktailMaker(String title) {
      super(title);
   }

   @Override
   public void makeDrink() {
      System.out.println(this + ": cocktail is ready");
   }
}