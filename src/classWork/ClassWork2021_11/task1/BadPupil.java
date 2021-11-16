package classWork.ClassWork2021_11.task1;

public class BadPupil extends Pupil {
   public BadPupil(String name, int stage) {
      super(name, stage);
   }

   @Override
   public void study() {
      super.study();
      System.out.print(" bad");
   }

   @Override
   public void read() {
      super.read();
      System.out.print(" bad");
   }

   @Override
   public void write() {
      super.write();
      System.out.print(" bad");
   }

   @Override
   public void relax() {
      super.relax();
      System.out.print(" excellent");
   }

}