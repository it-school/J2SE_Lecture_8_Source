package ClassWork.ClassWork2020.Task1;

public class Main {
   public static void main(String[] args) {
      Pupil pupil = new Pupil("Average pupil");
      System.out.println(pupil);

      System.out.println(pupil instanceof Pupil);
      System.out.println(pupil instanceof ExcellentPupil);

      ExcellentPupil excellentPupil = new ExcellentPupil("Excellent pupil");
      System.out.println(excellentPupil);

      BadPupil badPupil = new BadPupil("Bad pupil", "+38077788899");
      System.out.println(badPupil);

      ClassRoom classRoom = new ClassRoom();
      classRoom.addPupil(pupil);
      classRoom.addPupil(excellentPupil);
      classRoom.addPupil(new ExcellentPupil("Egor"));
      classRoom.addPupil(excellentPupil);
      classRoom.addPupil(badPupil);
      System.out.println(classRoom);

      ClassRoom classRoom2 = new ClassRoom(2);
      System.out.println(classRoom2);
      classRoom2.classroom[0] = new BadPupil("Ivan", "+36694646469");
      classRoom2.addPupil(excellentPupil, 1);
      System.out.println(classRoom2);
   }
}
