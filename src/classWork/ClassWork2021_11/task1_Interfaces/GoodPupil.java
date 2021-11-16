package classWork.ClassWork2021_11.task1_Interfaces;

public class GoodPupil extends Pupil {
   public GoodPupil(String name) {
      this.setName(name);
   }

   @Override
   public void study() {
      System.out.println("Studies good");
   }

   @Override
   public void read() {
      System.out.println("Reads good");
   }

   @Override
   public void write() {
      System.out.println("Writes good");
   }

   @Override
   public void relax() {
      System.out.println("Relaxes good");
   }
}