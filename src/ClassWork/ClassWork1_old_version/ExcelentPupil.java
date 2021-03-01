package ClassWork.ClassWork1_old_version;

public class ExcelentPupil extends Pupil {

   public ExcelentPupil(String name, int age) {
      super(name, age);
      this.characteristics = "excellent";
   }

   @Override
   String relax() {
      return super.relax() + "bad";
   }
}
