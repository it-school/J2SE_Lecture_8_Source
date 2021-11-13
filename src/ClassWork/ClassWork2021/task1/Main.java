package ClassWork.ClassWork2021.task1;

public class Main {
   public static void main(String[] args) {
      Pupil pupil = new Pupil("John", 1);
      System.out.println(pupil);
      pupil.study();
      pupil.read();
      pupil.write();
      pupil.relax();

      System.out.println(System.lineSeparator() + "------------------------" + System.lineSeparator());
      ExcellentPupil excellentPupil = new ExcellentPupil("Bill", 5);
      System.out.println(excellentPupil);
      excellentPupil.study();
      excellentPupil.read();
      excellentPupil.write();
      excellentPupil.relax();

      System.out.println(System.lineSeparator() + "------------------------" + System.lineSeparator());
      GoodPupil goodPupil = new GoodPupil("Fill", 7);
      System.out.println(goodPupil);
      goodPupil.study();
      goodPupil.read();
      goodPupil.write();
      goodPupil.relax();

      System.out.println(System.lineSeparator() + "------------------------" + System.lineSeparator());
      BadPupil badPupil = new BadPupil("Jack", 4);
      System.out.println(badPupil);
      badPupil.study();
      badPupil.read();
      badPupil.write();
      badPupil.relax();

      System.out.println(System.lineSeparator() + "------------------------" + System.lineSeparator());
      ClassRoom classRoom = new ClassRoom(pupil, badPupil, goodPupil, excellentPupil, new ExcellentPupil("Jessika", 2));
      System.out.println(classRoom);
   }
}
