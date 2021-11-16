package classWork.ClassWork2021_11.task2;

public class Car extends Vehicle {
   private static final int MAX_LIFTING = 10000;
   private int liftingСapacity;

   public Car(int price, double velocity, int year, String title, int liftingСapacity) {
      super(price, velocity, year, title);
      this.setLiftingСapacity(liftingСapacity);
   }

   public int getLiftingСapacity() {
      return liftingСapacity;
   }

   public void setLiftingСapacity(int liftingСapacity) {
      this.liftingСapacity = liftingСapacity > 0 && liftingСapacity < MAX_LIFTING ? liftingСapacity : MAX_LIFTING;
   }

   @Override
   public String toString() {
      return super.toString() + ", lifting capacity: " + this.liftingСapacity;
   }
}
