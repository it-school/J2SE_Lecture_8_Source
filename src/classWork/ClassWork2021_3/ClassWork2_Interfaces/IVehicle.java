package classWork.ClassWork2021_3.ClassWork2_Interfaces;

public interface IVehicle {
   Coordinates getCoordinates();

   void setCoordinates(Coordinates coordinates);

   int getPrice();

   void setPrice(int price);

   double getVelocity();

   void setVelocity(double velocity);

   int getYearProduced();

   void setYearProduced(int yearProducer);

   void print();

   void move(int longitude, int latitude);
}
