package ClassWork.ClassWork2021_3.ClassWork2_Interfaces;

public interface IVehicle {
   Coordinates getCoordinates();

   void setCoordinates(Coordinates coordinates);

   int getPrice();

   void setPrice(int price);

   double getVelocity();

   void setVelocity(double velocity);

   int getYearProduced();

   void setYearProduced(int yearProducedar);

   void print();
}
