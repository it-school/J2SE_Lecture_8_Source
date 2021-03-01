package ClassWork.ClassWork1_old_version;

public class GoodPupil extends Pupil {
   public GoodPupil(String name, int age) {
      super(name, age);
      this.characteristics = "good";
   }

   @Override
   String relax() {
      return super.relax() + this.characteristics;
   }
}

