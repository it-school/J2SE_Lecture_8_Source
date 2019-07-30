package ClassWork2;

import java.io.Serializable;
import java.util.Date;

public class Vehicle implements IVehicle {
    Coordinates coordinates;
    float speed;
    float price;
    Serializable productionYear;

    public Vehicle(float latitude, float longitude, float speed, float price, int productionYear) {
        this.SetCoordinates(longitude, latitude);
        this.SetSpeed(speed);
        this.SetPrice(price);
        this.SetProductionYear(productionYear);
    }

    public Vehicle() {
    }

    @Override
    public void SetCoordinates(float longitude, float latitude) {
        coordinates = new Coordinates(longitude, latitude);
    }

    @Override
    public Coordinates GetCoordinates() {
        return this.coordinates;
    }

    @Override
    public void SetPrice(float price) {
        this.price = price > 0 ? price : 0;
    }

    @Override
    public float GetPrice() {
        return this.price;
    }

    @Override
    public void SetSpeed(float speed) {
        this.speed = speed > 0 ? speed : 0;
    }

    @Override
    public float GetSpeed() {
        return this.speed;
    }

    @Override
    public void SetProductionYear(int year) {
        this.productionYear = year > Constants.MIN_PRODUCTION_YEAR ? year : Constants.ProductionYears.shipProductionYear;
        this.productionYear = year > (new Date().getYear() + 1900) ? new Date().getYear() + 1900 : year;

    }

    @Override
    public int GetProductionYear() {
        return 0;
    }

    @Override
    public String toString() {
        return this.getClass() + "{" +
                "coordinates=" + coordinates +
                ", speed=" + speed +
                ", price=" + price +
                ", productionYear=" + productionYear +
                '}';
    }
}
