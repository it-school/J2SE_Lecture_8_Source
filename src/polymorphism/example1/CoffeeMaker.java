package polymorphism.example1;

public class CoffeeMaker extends DrinkProducer {

   public CoffeeMaker(String title) {
      super(title);
   }

   @Override
   public void makeDrink() {
      System.out.println(this + ": coffee is ready");
   }
}