package ClassWork.Task1;

import java.util.Arrays;

public class ClassRoom {
   Pupil[] classroom;
   int curentPupilsNumber;

   public ClassRoom() {
      classroom = new Pupil[0];
   }

   public ClassRoom(int pupilsNumber) {
      classroom = new Pupil[pupilsNumber];

      for (int i = 0; i < classroom.length; i++) {
         classroom[i] = new Pupil("");
      }

      curentPupilsNumber = 0;
   }

   public void addPupil(Pupil pupil) { // OverLoad
      Pupil[] temp = Arrays.copyOf(classroom, classroom.length + 1);
      temp[classroom.length] = pupil;
      this.classroom = temp;
   }

   public void addPupil(Pupil pupil, int position) { // OverLoad
      if (position < classroom.length)
         classroom[position] = pupil;
   }

   @Override
   public String toString() {
      String result = System.lineSeparator();

      for (Pupil pupil : classroom)
         result += pupil.toString() + System.lineSeparator();

      return result;
   }
}
