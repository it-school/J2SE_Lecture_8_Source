package ClassWork.ClassWork2021_3.ClassWork2_Interfaces;

import ClassWork.ClassWork2020.ClassWork2_v2.Coordinates;

public class Ship extends Vehicle
{
	private int passengersNumber;
	private String port;

	public Ship(Coordinates coordinates, int price, int speed, int year, int passengersNumber, String port)
	{
		super(coordinates, price, speed, year);
		this.passengersNumber = passengersNumber;
		this.port = port;
		measurements = "k/h"; // knots per hour
	}

	public int getPassengersNumber()
	{
		return passengersNumber;
	}

	public void setPassengersNumber(int passengersNumber)
	{
		this.passengersNumber = passengersNumber > 0 ? passengersNumber : -1;
	}

	public String getPort()
	{
		return port;
	}

	public void setPort(String port)
	{
		this.port = port;
	}

	@Override
	public String toString()
	{
		String res = super.toString();
		res =
				"Ship " + res.substring(0, res.length() - 1) + ", port=" + (!port.equals("") ? port : "n/a") + ", " +
						"passengers=" + (passengersNumber > 0 ? passengersNumber : "n/a") + "}";
		return res;
	}

	@Override
	public void print()
	{
		System.out.println(this);
	}
}
