package abstraction.abstraction_001;

// Абстрактный класс.
abstract class AbstractClass {
   abstract void Method();
}

// Конкретный класс.
class ConcreteClass extends AbstractClass {
   void Method() {
      System.out.println("Абстрактный метод реализован");
   }
}

public class Main {
   public static void main(String[] args) {
      AbstractClass instance = new ConcreteClass();
      instance.Method();
   }
}