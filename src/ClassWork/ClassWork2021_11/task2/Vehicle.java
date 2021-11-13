package ClassWork.ClassWork2021_11.task2;

import java.time.LocalDate;

public class Vehicle {
   protected int price;
   protected double velocity;
   protected int year;
   protected String title;

   public Vehicle(int price, double velocity, int year, String title) {
      this.setPrice(price);
      this.setVelocity(velocity);
      this.setYear(year);
      this.setTitle(title);
   }

   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title.strip();
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
      return System.lineSeparator() + this.getClass().getSimpleName() + " vehicle:\n" + this.title +
              ", price: " + price +
              ", velocity: " + velocity +
              ", year: " + year;
   }

   public int getYear() {
      return year;
   }

   public void setYear(int year) {
      this.year = (year <= LocalDate.now().getYear() ? year : LocalDate.now().getYear());
   }

   protected void move(Coordinates coordinates) {
      System.out.println(this + " is moving to " + coordinates);
   }
}
