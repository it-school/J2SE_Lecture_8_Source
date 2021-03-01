package ClassWork.ClassWork2;

import java.io.Serializable;
import java.util.Date;

public class Vehicle {
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

   public void SetCoordinates(float longitude, float latitude) {
      coordinates = new Coordinates(longitude, latitude);
   }

   public Coordinates GetCoordinates() {
      return this.coordinates;
   }

   public void SetPrice(float price) {
      this.price = price > 0 ? price : 0;
   }

   public float GetPrice() {
      return this.price;
   }

   public void SetSpeed(float speed) {
      this.speed = speed > 0 ? speed : 0;
   }

   public float GetSpeed() {
      return this.speed;
   }

   public void SetProductionYear(int year) {
      this.productionYear = year > Constants.MIN_PRODUCTION_YEAR ? year : Constants.ProductionYears.shipProductionYear;
      this.productionYear = year > (new Date().getYear() + 1900) ? new Date().getYear() + 1900 : year;
   }

   public int GetProductionYear() {
      return 0;
   }

   @Override
   public String toString() {
      return this.getClass().getSimpleName() + "{" +
              "coordinates=" + coordinates +
              ", speed=" + speed +
              ", price=" + price +
              ", productionYear=" + productionYear + '}';
   }
}
