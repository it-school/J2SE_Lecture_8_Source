package ClassWork.ClassWork2020.Task1;

public class ExcellentPupil extends Pupil {

   public ExcellentPupil(String name) {
      super(name);
   }

   @Override
   public String toString() {
      return "Excellent " + super.toString();
   }

   @Override
   public String Study() {
      return super.Study() + "excellent";
   }

   @Override
   public String Relax() {
      return super.Relax() + "bad";
   }


}
