package ClassWork2_v2;

public class Car extends Vehicle
{
	private int volume;
	private int tonnage;

	public Car(Coordinates coordinates, int price, int speed, int year, int volume, int tonnage)
	{
		super(coordinates, price, speed, year);
		this.volume = volume;
		this.tonnage = tonnage;
	}

	public int getVolume()
	{
		return volume;
	}

	public void setVolume(int volume)
	{
		this.volume = volume > 0 ? volume : -1;
	}

	public int getTonnage()
	{
		return tonnage;
	}

	public void setTonnage(int tonnage)
	{
		this.tonnage = tonnage > 0 ? tonnage : -1;
	}

	@Override
	public String toString()
	{
		String res = super.toString();
		res = "Car " + res.substring(0, res.length() - 1) + ", volume=" + (volume > 0 ?
				volume : "n/a") + ", tonnage=" + (tonnage > 0 ?
				tonnage : "n/a") + "}";
		return res;
	}
}
