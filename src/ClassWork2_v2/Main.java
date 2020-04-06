package ClassWork2_v2;

public class Main
{
	public static void main(String[] args)
	{
		Vehicle vehicle = new Vehicle(new Coordinates(42, 36), 1000, 100, 2000);
		System.out.println(vehicle);

		Plane plane = new Plane(new Coordinates(82, 39), 1000000, 1000, 2020, 5000, 10);
		System.out.println(plane);
	}
}
