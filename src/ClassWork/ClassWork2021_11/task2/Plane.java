package ClassWork.ClassWork2021_11.task2;

public class Plane extends Vehicle {
   private static final int MIN_PASSENGERS = 20;
   private final int MIN_HEIGHT = 1000;
   private final int MAX_HEIGHT = 10000;

   private int maxHeight;
   private int passengersQuantity;

   public Plane(int price, double velocity, int year, String title, int maxHeight, int passengersQuantity) {
      super(price, velocity, year, title);
      this.setMaxHeight(maxHeight);
      this.setPassengersQuantity(passengersQuantity);
   }

   public int getMaxHeight() {
      return maxHeight;
   }

   public void setMaxHeight(int maxHeight) {
      this.maxHeight = (maxHeight >= MIN_HEIGHT && maxHeight <= MAX_HEIGHT ? maxHeight : MIN_HEIGHT);
   }

   public int getPassengersQuantity() {
      return passengersQuantity;
   }

   public void setPassengersQuantity(int passengersQuantity) {
      this.passengersQuantity = (passengersQuantity > 0 && passengersQuantity < MIN_PASSENGERS ? passengersQuantity : MIN_PASSENGERS);
   }

   @Override
   public String toString() {
      return super.toString() + ", max height: " + this.maxHeight + ", max passengers: " + this.passengersQuantity;
   }
}
