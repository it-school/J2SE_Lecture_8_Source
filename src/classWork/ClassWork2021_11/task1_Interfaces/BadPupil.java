package classWork.ClassWork2021_11.task1_Interfaces;

public class BadPupil extends Pupil {
   public BadPupil(String name) {
      this.setName(name);
   }

   @Override
   public void study() {
      System.out.println("Studies bad");
   }

   @Override
   public void read() {
      System.out.println("Reads bad");
   }

   @Override
   public void write() {
      System.out.println("Writes bad");
   }

   @Override
   public void relax() {
      System.out.println("Relaxes excellent");
   }
}