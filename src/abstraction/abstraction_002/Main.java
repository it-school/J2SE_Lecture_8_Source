package abstraction.abstraction_002;
// Абстрактный класс может быть унаследован от конкретного класса.

// Конкретный класс A.
class ConcreteClassA {
   void Operation() {
      System.out.println("ConcreteClassA.Operation");
   }
}

// Абстрактный класс.
abstract class AbstractClass extends ConcreteClassA {
   abstract void Method();
}

// Конкретный класс B.
class ConcreteClassB extends AbstractClass {
   void Method() {
      System.out.println("ConcreteClassB.Method");
   }
}

class Main {
   public static void main(String[] args) {
      AbstractClass instance = new ConcreteClassB();

      instance.Method();
      instance.Operation();
   }
}