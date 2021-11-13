package ClassWork.ClassWork2021.task2;

import java.time.LocalDate;

public class Vehicle {
   protected int price;
   protected double velocity;
   protected int year;

   public Vehicle(int price, double velocity, int year) {
      this.setPrice(price);
      this.setVelocity(velocity);
      this.setYear(year);
   }

   public int getPrice() {
      return price;
   }

   public void setPrice(int price) {
      this.price = (price > 0 ? price : 1);
   }

   public double getVelocity() {
      return velocity;
   }

   public void setVelocity(double velocity) {
      this.velocity = (velocity > 0 ? velocity : -1);
   }

   @Override
   public String toString() {
      return "Vehicle:\n" +
              "price=" + price +
              ", velocity=" + velocity +
              ", year=" + year;
   }

   public int getYear() {
      return year;
   }

   public void setYear(int year) {
      this.year = (year <= LocalDate.now().getYear() ? year : LocalDate.now().getYear());
   }

   protected void move(Coordinates coordinates) {
      System.out.println("Moving to " + coordinates);
   }

}
