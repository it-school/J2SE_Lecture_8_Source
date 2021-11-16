package classWork.ClassWork2021_11.task1_Interfaces;

public class ExcellentPupil extends Pupil {

   public ExcellentPupil(String name) {
      this.setName(name);
   }

   @Override
   public void study() {
      System.out.println("Studies excellent");
   }

   @Override
   public void read() {
      System.out.println("Reads excellent");
   }

   @Override
   public void write() {
      System.out.println("Writes excellent");
   }

   @Override
   public void relax() {
      System.out.println("Relaxes weak");
   }
}