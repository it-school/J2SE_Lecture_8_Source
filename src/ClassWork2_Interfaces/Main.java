package ClassWork2_Interfaces;

import ClassWork2_v2.Coordinates;

public class Main
{
	public static void main(String[] args)
	{
		//Vehicle vehicle = new Vehicle(new Coordinates(46, 30), 10000, 120, 2020);
		//System.out.println(vehicle);

		Ship ship = new Ship(new Coordinates(82, 39), 500000, 30, 2010, 200, "Odessa");
		ship.print();
	}
}
