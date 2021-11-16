package classWork.ClassWork2021_11.task1_Interfaces;

public class Main {

   public static void main(String[] args) {
      Pupil pupil = new ExcellentPupil("John");
      pupil.getInfo();

      System.out.println();
      pupil = new GoodPupil("Bill");
      pupil.getInfo();
      
      System.out.println();
      pupil = new BadPupil("Jeff");
      pupil.getInfo();
   }
}
