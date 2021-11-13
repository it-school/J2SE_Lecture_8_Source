package ClassWork.ClassWork2021_11.task2;

public class Coordinates {
   private double longitude;
   private double latitude;

   public Coordinates(double longitude, double latitude) {
      this.setLatitude(latitude);
      this.setLongitude(longitude);
   }

   private void setLongitude(double longitude) {
      this.longitude = (longitude >= -180 && longitude <= 180 ? longitude : 0);
   }

   private void setLatitude(double latitude) {
      this.latitude = (latitude >= -90 && latitude <= 90 ? latitude : 0);
   }

   @Override
   public String toString() {
      return "{" + String.format("%5.2f", longitude) + ", " + String.format("%5.2f", latitude) + '}';
   }
}
