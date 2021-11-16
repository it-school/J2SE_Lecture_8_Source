package classWork.ClassWork2021_11.task2;

public class Main {
   public static void main(String[] args) {
      System.out.println("\nTask2:\n");

      Vehicle vehicle = new Vehicle(100000, 20, 2020, "Vehicle");
      System.out.println(vehicle);
      vehicle.move(new Coordinates(36, 42));

      Bicycle bicycle = new Bicycle(1000, 100, 2022, "Author", BicycleType.road, 8);
      System.out.println(bicycle);

      Plane plane = new Plane(100000, 400, 2020, "Ан-2", 2000, 14);
      System.out.println(plane);

      Ship ship = new Ship(190000, 30, 2016, "Cassiopea", 10, "Istanbul");
      System.out.println(ship);

      Car car = new Car(60000, 140, 2020, "Kamaz", 5500);
      System.out.println(car);

      System.out.println();
      Garage garage = new Garage(bicycle, plane, ship, car, car, car);
      System.out.println(garage);

      garage.getGarage()[0].move(new Coordinates(0, 0));
   }
}