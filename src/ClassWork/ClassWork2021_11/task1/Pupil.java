package ClassWork.ClassWork2021_11.task1;

public class Pupil {
   protected String name;
   protected int stage;

   public Pupil(String name, int stage) {
      this.setName(name);
      this.setStage(stage);
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name.strip();
   }

   public int getStage() {
      return stage;
   }

   public void setStage(int stage) {
      this.stage = (stage >= 0 && stage <= 12 ? stage : -1);
   }

   public void study() {
      System.out.print(System.lineSeparator() + "Studies");
   }

   public void read() {
      System.out.print(System.lineSeparator() + "Reads");
   }

   public void write() {
      System.out.print(System.lineSeparator() + "Writes");
   }

   public void relax() {
      System.out.print(System.lineSeparator() + "Relaxes");
   }

   @Override
   public String toString() {
      return this.getClass().getSimpleName() + " {" + "name: '" + name + '\'' + ", class: " + stage + '}';
   }
}
