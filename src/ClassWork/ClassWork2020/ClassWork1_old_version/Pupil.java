package ClassWork.ClassWork2020.ClassWork1_old_version;

public class Pupil {
   protected String name;
   protected int age;
   protected String characteristics;

   public Pupil(String name, int age) {
      this.name = name;
      this.age = age;
      this.characteristics = "";
   }

   String study() {
      return this.name + " usually studies " + this.characteristics;
   }

   String read() {
      return this.name + " usually reads " + this.characteristics;
   }

   String write() {
      return this.name + " usually writes " + this.characteristics;
   }

   String relax() {
      return this.name + " usually relaxes ";
   }

   @Override
   public String toString() {
      String className = this.getClass().toString();
      return className.substring(this.getClass().toString().lastIndexOf(".") + 1) + " {" +
              "name='" + name + '\'' +
              ", age=" + age +
              ", characteristics='" + this.study() + ", " + this.read() + ", " + this.write() + ", " + this.relax() + ", " +
              '}';
   }
}
