package ClassWork.ClassWork2021.task2;

public class Main {
   public static void main(String[] args) {
      Vehicle vehicle = new Vehicle(100000, 20, 2020);
      System.out.println(vehicle);
      vehicle.move(new Coordinates(36, 42));

      Bicycle bicycle = new Bicycle(1000, 100, 2022, BicycleType.road, 8);
      System.out.println(bicycle);

      
   }
}
