package ClassWork.Task1;

public class BadPupil extends Pupil {
   String parentsPhone;

   public BadPupil(String name, String phoneNumber) {
      super(name);
      this.parentsPhone = phoneNumber;
   }

   @Override
   public String toString() {
      return "Bad " + super.toString() + "\n" + this.parentsPhone;
   }

   @Override
   public String Study() {
      return super.Study() + " bad";
   }

   @Override
   public String Relax() {
      return super.Relax() + "excellent";
   }
}
