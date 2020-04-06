package ClassWork2_v2;

import java.util.Date;

public class Vehicle
{
	private Coordinates coordinates;
	private int price;
	private int speed;
	private int year;

	public Vehicle(Coordinates coordinates, int price, int speed, int year)
	{
		this.setCoordinates(coordinates);
		this.setPrice(price);
		this.setSpeed(speed);
		this.setYear(year);
	}

	public Vehicle()
	{
	}

	public Coordinates getCoordinates()
	{
		return coordinates;
	}

	public void setCoordinates(Coordinates coordinates)
	{
		this.coordinates = coordinates;
	}

	public int getPrice()
	{
		return price;
	}

	public void setPrice(int price)
	{
		this.price = price > 0 ? price : -1;
	}

	public int getSpeed()
	{
		return speed;
	}

	public void setSpeed(int speed)
	{
		this.speed = speed > 0 ? speed : -1;
	}

	public int getYear()
	{
		return year;
	}

	public void setYear(int year)
	{
		this.year = year > 1900 && year <= (new Date().getYear() + 1900) ? year : -1;
	}

	@Override
	public String toString()
	{
		return "Vehicle{" +
				"coordinates=" + coordinates +
				", price=" + (price > 0 ? price : "n/a") +
				", speed=" + (speed > 0 ? speed : "n/a") +
				", year=" + (year > 0 ? year : "n/a") +
				'}';
	}
}
