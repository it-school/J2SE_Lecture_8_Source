package polymorphism.example1;

public class TeaMaker extends DrinkProducer {
   public TeaMaker(String title) {
      super(title);
   }

   @Override
   public void makeDrink() {
      System.out.println(this + ": tea is ready");
   }
}