package classWork.ClassWork2021_3.ClassWork2_Interfaces;

import java.util.Arrays;

public class Main {
   public static void main(String[] args) {
      //Vehicle vehicle = new Vehicle(new Coordinates(46, 30), 10000, 120, 2020);
      //System.out.println(vehicle);

      Ship ship = new Ship(new Coordinates(82, 39), 500000, 30, 2010, 200, "Odessa");
      ship.print();

      ship.move(30, 42);

      ship.print();


      Car truck = new Car(new Coordinates(20, 30), 100000, 120, 2022, 30);
      truck.print();
      truck.move(0, 0);
      truck.print();

      Vehicle[] garage = new Vehicle[10];
      garage[0] = ship;
      garage[1] = truck;

      System.out.println();
      System.out.println(Arrays.toString(garage));
      garage[1].print();

/*
      TimeZone zone;
      Calendar calendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
      System.out.println(calendar.get(Calendar.DATE));

 */
   }
}
