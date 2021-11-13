package ClassWork.ClassWork2021_11.task1;

public class GoodPupil extends Pupil {
   public GoodPupil(String name, int stage) {
      super(name, stage);
   }

   @Override
   public void study() {
      super.study();
      System.out.print(" good");
   }

   @Override
   public void read() {
      super.read();
      System.out.print(" good");
   }

   @Override
   public void write() {
      super.write();
      System.out.print(" good");
   }

   @Override
   public void relax() {
      super.relax();
      System.out.print(" good");
   }
}
