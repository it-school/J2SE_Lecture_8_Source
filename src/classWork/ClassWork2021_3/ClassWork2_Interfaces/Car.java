package classWork.ClassWork2021_3.ClassWork2_Interfaces;

public class Car extends Vehicle {
   public static final int DEAULT_TONNAGE = 10;
   private int tonnage;


   public Car(Coordinates coordinates, int price, int speed, int year, int tonnage) {
      super(coordinates, price, speed, year);
      this.setTonnage(tonnage);
   }

   @Override
   public void print() {
      System.out.println(this.getClass().getSimpleName() + this + ", tonnage: " + this.getTonnage());
   }

   @Override
   public void move(int longitude, int latitude) {
      super.move(longitude, latitude);
      System.out.println("This " + this.getClass().getSimpleName() + " is going (driving) to " + this.getCoordinates());
   }

   public int getTonnage() {
      return tonnage;
   }

   public void setTonnage(int tonnage) {
      this.tonnage = tonnage > 0 ? tonnage : DEAULT_TONNAGE;
   }
}
