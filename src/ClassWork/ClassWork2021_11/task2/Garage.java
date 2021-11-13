package ClassWork.ClassWork2021_11.task2;

public class Garage {
   private final Vehicle[] garage;

   public Garage(Vehicle... garage) {
      this.garage = garage;
   }

   public Vehicle[] getGarage() {
      return garage;
   }

   @Override
   public String toString() {
      String result = "Garage:";

      if (this.garage.length == 0)
         result += " is empty";

      for (Vehicle vehicle : garage) {
         result += "\n" + vehicle;
      }

      return result;
   }
}
