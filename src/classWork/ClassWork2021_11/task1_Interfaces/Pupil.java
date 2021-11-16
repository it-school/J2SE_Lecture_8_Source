package classWork.ClassWork2021_11.task1_Interfaces;

public abstract class Pupil implements IPupil {
   private String fio;

   @Override
   public String getName() {
      return this.fio;
   }

   @Override
   public void setName(String name) {
      this.fio = name.strip();
   }

   @Override
   public String toString() {
      return this.getClass().getSimpleName() + " {" + fio + '}';
   }

   public void getInfo() {
      System.out.println(this);
      this.study();
      this.read();
      this.write();
      this.relax();
   }
}
