package ClassWork.ClassWork2020.Task1;

import java.util.Objects;

public class Pupil {
   private String name;

   public Pupil(String name) {
      this.name = name;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   @Override
   public String toString() {
      return " pupil" + name + "' " + this.Study() + this.Relax();
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Pupil pupil = (Pupil) o;
      return Objects.equals(getName(), pupil.getName());
   }

   @Override
   public int hashCode() {
      return Objects.hash(getName());
   }

   public String Study() {
      return "\tStudies ";
   }

   public String Relax() {
      return "\tRelaxes ";
   }
}
