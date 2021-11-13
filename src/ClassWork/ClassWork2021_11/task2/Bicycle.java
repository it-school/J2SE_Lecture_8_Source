package ClassWork.ClassWork2021_11.task2;

public class Bicycle extends Vehicle {
   private static final double MIN_WEIGHT = 5;
   private BicycleType type;
   private double weight;

   public Bicycle(int price, double velocity, int year, String title, BicycleType type, double weight) {
      super(price, velocity, year, title);
      this.type = type;
      this.setWeight(weight);
   }

   public BicycleType getType() {
      return type;
   }

   public void setType(BicycleType type) {
      this.type = type;
   }

   public double getWeight() {
      return weight;
   }

   public void setWeight(double weight) {
      this.weight = (weight > MIN_WEIGHT ? weight : MIN_WEIGHT);
   }

   @Override
   public String toString() {
      return super.toString() + ", type: " + this.type + ", weight: " + this.weight;
   }
}
