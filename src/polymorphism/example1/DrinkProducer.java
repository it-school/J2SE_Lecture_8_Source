package polymorphism.example1;

abstract public class DrinkProducer implements IDrinkProducer {
   private String title;

   public DrinkProducer(String title) {
      this.title = title;
   }

   abstract public void makeDrink();

   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   @Override
   public String toString() {
      return this.getClass().getSimpleName() + " (" + title + ')';
   }
}