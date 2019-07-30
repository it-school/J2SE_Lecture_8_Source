package ClassWork2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(30, 46, 100, 10000, 2000);
        System.out.println(vehicle);

        Ship ship = new Ship(46, 30, 20, 1000000, 2019, 6, "Odessa");
        System.out.println(ship);

        //ship = (Ship)vehicle;
        System.out.println(vehicle);

        Random r = new Random();
        System.out.println((int) (r.nextDouble() * 100));
    }
}
