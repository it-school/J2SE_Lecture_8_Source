package abstraction.abstraction_006;

public abstract class AbstractClass {
   static int field = 5;

   static void StaticMethod() {
      System.out.println("Static method");
   }

   void Method() {
      System.out.println("AbstractClass method");
   }
}

class Child extends AbstractClass {
   @Override
   void Method() {
      System.out.println("Child Class method");
   }

   void Method2() {
      System.out.println("Child Class method2");
   }
}

class MainClass {
   public static void main(String[] args) {
      AbstractClass abstractClass;
      Child child = new Child();
      ((AbstractClass) child).Method();
      abstractClass = child;
      abstractClass.Method();

      abstractClass.Method();
      child.Method2();

      AbstractClass.StaticMethod();
      AbstractClass.StaticMethod();
      Child.StaticMethod();
      AbstractClass.StaticMethod();
   }
}