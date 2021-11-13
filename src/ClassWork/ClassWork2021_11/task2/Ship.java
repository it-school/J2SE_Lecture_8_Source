package ClassWork.ClassWork2021_11.task2;

public class Ship extends Vehicle {
   private static final int MAX_PASSENGERS = 50;

   private int passengersQuantity;
   private String portName;

   public Ship(int price, double velocity, int year, String title, int passengersQuantity, String portName) {
      super(price, velocity, year, title);
      this.setPassengersQuantity(passengersQuantity);
      this.setPortName(portName);
   }

   public int getPassengersQuantity() {
      return passengersQuantity;
   }

   public void setPassengersQuantity(int passengersQuantity) {
      this.passengersQuantity = passengersQuantity > 0 && passengersQuantity < MAX_PASSENGERS ? passengersQuantity : MAX_PASSENGERS;
   }

   public String getPortName() {
      return portName;
   }

   public void setPortName(String portName) {
      this.portName = portName.strip();
   }

   @Override
   public String toString() {
      return super.toString() + ", port name: " + this.portName + ", max passengers: " + this.passengersQuantity;
   }
}
