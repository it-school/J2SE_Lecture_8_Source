package ClassWork.ClassWork2020.ClassWork1_old_version;

public class BadPupil extends Pupil {
   public BadPupil(String name, int age) {
      super(name, age);
      this.characteristics = "bad";
   }

   @Override
   String relax() {
      return super.relax() + "excellent";
   }
}
