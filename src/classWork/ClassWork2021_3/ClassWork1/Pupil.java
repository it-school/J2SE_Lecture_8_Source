package classWork.ClassWork2021_3.ClassWork1;

public class Pupil {
   protected String name;
   protected String characteristics;

   public Pupil(String name) {
      this.name = name;
   }

   public Pupil() {
   }

   public void Study() {
      System.out.print("Studies ");
   }

   public void Read() {
      System.out.print("Reads ");
   }

   public void Write() {
      System.out.print("Writes ");
   }

   public void Relax() {
      System.out.print("Relax ");
   }

   @Override
   public String toString() {
      return characteristics + " pupil: " + name + "\nStudies " + characteristics + "\tReads " + characteristics
              + "\tWrites " + characteristics + "\tRelax " + characteristics + "\n";
   }
}
