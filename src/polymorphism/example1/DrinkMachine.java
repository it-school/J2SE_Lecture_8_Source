package polymorphism.example1;

public class DrinkMachine {
   DrinkProducer[] makers;

   public DrinkMachine(DrinkProducer... makers) {
      this.makers = makers;
   }

   public void demo() {
      for (DrinkProducer drinkProducer : makers) {
         drinkProducer.makeDrink();
      }
   }
}