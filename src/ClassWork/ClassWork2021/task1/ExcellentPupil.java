package ClassWork.ClassWork2021.task1;

public class ExcellentPupil extends Pupil {
   public ExcellentPupil(String name, int stage) {
      super(name, stage);
   }

   @Override
   public void study() {
      super.study();
      System.out.print(" excellent");
   }

   @Override
   public void read() {
      super.read();
      System.out.print(" excellent");
   }

   @Override
   public void write() {
      super.write();
      System.out.print(" excellent");
   }

   @Override
   public void relax() {
      super.relax();
      System.out.print(" weak");
   }
}
