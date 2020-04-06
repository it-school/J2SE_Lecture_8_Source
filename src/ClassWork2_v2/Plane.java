package ClassWork2_v2;

public class Plane extends Vehicle
{
	private int top;
	private int passengers;

	public Plane(Coordinates coordinates, int price, int speed, int year, int top, int passengers)
	{
		super(coordinates, price, speed, year);
		this.setPassengers(passengers);
		this.setTop(top);
	}

	public Plane()
	{
	}

	public int getTop()
	{
		return top;
	}

	public void setTop(int top)
	{
		this.top = top > 0 ? top : -1;
	}

	public int getPassengers()
	{
		return passengers;
	}

	public void setPassengers(int passengers)
	{
		this.passengers = passengers > 0 ? passengers : -1;
	}

	@Override
	public String toString()
	{
		String res = super.toString();
		res = res.substring(0, res.length() - 1) + ", top=" + top + ", passengers=" + passengers + "}";
		return res;
	}
}
