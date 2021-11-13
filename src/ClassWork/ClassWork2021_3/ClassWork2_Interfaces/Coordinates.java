package ClassWork.ClassWork2021_3.ClassWork2_Interfaces;

public class Coordinates {
   private float longitude;
   private float latitude;

   public Coordinates(float longitude, float latitude) {
      this.setLatitude(latitude);
      this.setLongitude(longitude);
   }

   public float getLongitude() {
      return longitude;
   }

   public void setLongitude(float longitude) {
      this.longitude = longitude > 180 || longitude < -180 ? 0 : longitude;
   }

   public float getLatitude() {
      return latitude;
   }

   public void setLatitude(float latitude) {
      this.latitude = latitude > 90 || latitude < -90 ? 0 : latitude;
   }

   @Override
   public String toString() {
      return "Coordinates{" + String.format("%6.2f", longitude) + ", " + String.format("%6.2f", latitude) + '}';
   }
}
