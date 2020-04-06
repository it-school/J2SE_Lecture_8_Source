package ClassWork2_v2;

public class Coordinates
{
	private double longitude;
	private double latitude;

	public Coordinates(double longitude, double latitude)
	{
		this.setLatitude(longitude);
		this.setLongitude(latitude);
	}

	public double getLongitude()
	{
		return longitude;
	}

	public void setLongitude(double longitude)
	{
		this.longitude = longitude >= 0 && longitude <= 180 ? longitude : -1;
	}

	public double getLatitude()
	{
		return latitude;
	}

	public void setLatitude(double latitude)
	{
		this.latitude = latitude >= 0 && latitude <= 90 ? latitude : -1;
	}

	@Override
	public String toString()
	{
		return "(" + (longitude >= 0 ? longitude : "n/a") + ", " + (latitude >= 0 ? latitude : "n/a") + ")";
	}
}
