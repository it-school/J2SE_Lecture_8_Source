package interfaces.Interfaces_001;

interface IInterface {
   void method();

   default void defaultMethod() {
      System.out.println("Default method");
   }
}

interface ISecondInterface {
   void secondMethod();
}

class MyClass implements IInterface, ISecondInterface {
   @Override
   public void method() {
      System.out.println("Метод - реализация Интерфейса.");
   }

   @Override
   public void secondMethod() {
      System.out.println("Метод - реализация Интерфейса 2.");
   }
}

public class Main {
   public static void main(String[] args) {
      MyClass my = new MyClass();

      my.method();
      my.secondMethod();
      my.defaultMethod();
   }
}