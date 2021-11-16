package classWork.ClassWork2021_3.ClassWork1;

public class ClassRoom {
   public Pupil[] pupils;

   public ClassRoom(int n) {
      this.pupils = new Pupil[n];
   }

   @Override
   public String toString() {
      String result = "";
      for (Pupil pupil : pupils) {
         result += pupil.toString() + "\n";
      }
      return "ClassRoom{\n" + result + "\n}";
   }
}
