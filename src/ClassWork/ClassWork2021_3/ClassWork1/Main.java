package ClassWork.ClassWork2021_3.ClassWork1;

public class Main {
   public static void main(String[] args) {
      Pupil pupil = new Pupil("John");
      System.out.println(pupil);
      pupil.Study();
      pupil.Read();
      pupil.Write();
      pupil.Relax();

      System.out.println();
      ExcelentPupil pupilE = new ExcelentPupil("Billy");
      System.out.println(pupilE);
      pupilE.Study();
      pupilE.Read();
      pupilE.Write();
      pupilE.Relax();

      System.out.println();
      GoodPupil pupilG = new GoodPupil("Carl");
      System.out.println(pupilG);
      pupilG.Study();
      pupilG.Read();
      pupilG.Write();
      pupilG.Relax();

      System.out.println();
      BadPupil pupilB = new BadPupil("Jefrey");
      System.out.println(pupilB);
      pupilB.Study();
      pupilB.Read();
      pupilB.Write();
      pupilB.Relax();

      System.out.println("\n--------------------------\n");
      ClassRoom classRoom = new ClassRoom(4);
      classRoom.pupils[0] = pupilE;
      classRoom.pupils[1] = pupilG;
      classRoom.pupils[2] = pupilB;
      classRoom.pupils[3] = new Pupil("Andrew");
      System.out.println(classRoom);

   }
}
