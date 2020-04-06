package ClassWork2_v2;

public class Ship extends Vehicle
{
	private int passengers;
	private String port;

	public Ship(Coordinates coordinates, int price, int speed, int year, int passengers, String port)
	{
		super(coordinates, price, speed, year);
		this.passengers = passengers;
		this.port = port;
	}

	public int getPassengers()
	{
		return passengers;
	}

	public void setPassengers(int passengers)
	{
		this.passengers = passengers > 0 ? passengers : -1;
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
						"passengers=" + (passengers > 0 ? passengers : "n/a") + "}";
		return res;
	}
}
