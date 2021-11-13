package ClassWork.ClassWork2020.ClassWork2_v2;

public class Main
{
	public static void main(String[] args)
	{
		Vehicle vehicle = new Vehicle(new Coordinates(42, 36), 1000, 100, 2000);
		System.out.println(vehicle);

		Plane plane = new Plane(new Coordinates(82, 39), 1000000, 1000, 2020, 5000, 10);
		System.out.println(plane);

		Car car = new Car(new Coordinates(82, 39), 100000, 300, 2019, 2000, 3);
		System.out.println(car);

		Ship ship = new Ship(new Coordinates(82, 39), 500000, 30, 2010, 200, "Odessa");
		System.out.println(ship);
	}
}
