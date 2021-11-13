package ClassWork.ClassWork2021_3.ClassWork1;

public class ExcelentPupil extends Pupil {

   public ExcelentPupil(String name) {
      super(name);
      characteristics = " excelent";
   }

   public ExcelentPupil() {
      super();
      characteristics = " excelent";
   }

   @Override
   public void Study() {
      super.Study();
      System.out.print(characteristics + "\n");
   }

   @Override
   public void Read() {
      super.Read();
      System.out.print(characteristics + "\n");
   }

   @Override
   public void Write() {
      super.Write();
      System.out.print(characteristics + "\n");
   }

   @Override
   public void Relax() {
      super.Relax();
      System.out.print(" not " + characteristics + "\n");

   }

   @Override
   public String toString() {
      return super.toString();
   }
}
