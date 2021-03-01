package ClassWork.ClassWork2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();

        Vehicle vehicle = new Vehicle(30, 46, 100 + r.nextInt(50), 10000, 2000);
        System.out.println(vehicle);

        Ship ship = new Ship(46, 30, 10 + r.nextInt(20), 1000000, 2019, 6, "Odessa");
        System.out.println(ship);

        // ship = (Ship)vehicle; // ошибка
        // System.out.println(vehicle);

    }
}
