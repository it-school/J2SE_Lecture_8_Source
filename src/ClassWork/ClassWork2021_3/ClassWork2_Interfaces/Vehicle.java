package ClassWork.ClassWork2021_3.ClassWork2_Interfaces;

import ClassWork.ClassWork2020.ClassWork2_v2.Coordinates;

import java.util.Date;

public abstract class Vehicle implements IVehicle
{
	protected String measurements;
	private Coordinates coordinates;
	private int price;
	private double velocity;
	private int yearProduced;

	public Vehicle(Coordinates coordinates, int price, int speed, int year)
	{
		this.setCoordinates(coordinates);
		this.setPrice(price);
		this.setVelocity(speed);
		this.setYearProduced(year);
		this.measurements = "";
	}

	@Override
	public Coordinates getCoordinates()
	{
		return this.coordinates;
	}

	@Override
	public void setCoordinates(Coordinates coordinates)
	{
		this.coordinates = coordinates;
	}

	@Override
	public int getPrice()
	{
		return this.price;
	}

	@Override
	public void setPrice(int price)
	{
		this.price = price > 0 ? price : -1;
	}

	@Override
	public double getVelocity()
	{
		return 0;
	}

	@Override
	public void setVelocity(double velocity)
	{
		this.velocity = velocity > 0 ? velocity : -1;
	}

	@Override
	public int getYearProduced()
	{
		return this.yearProduced;
	}

	@Override
	public void setYearProduced(int yearProduced)
	{
		this.yearProduced = yearProduced > 1900 && yearProduced <= (new Date().getYear() + 1900) ? yearProduced : -1;
	}

	@Override
	public String toString()
	{
		return "Vehicle{" +
				"coordinates=" + coordinates +
				", price=" + (price > 0 ? price : "n/a") +
				", speed=" + (velocity > 0 ? (velocity + " " + measurements).trim() : "n/a") +
				", year=" + (yearProduced > 0 ? yearProduced : "n/a") +
				'}';
	}
}
