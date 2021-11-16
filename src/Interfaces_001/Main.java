package Interfaces_001;

interface Interface {
   void method();

   default void defaultMethod() {
      System.out.println("Default method");
   }
}

class MyClass implements Interface {
   @Override
   public void method() {
      System.out.println("Метод - реализация Интерфейса.");
   }
}

public class Main {
   public static void main(String[] args) {
      MyClass my = new MyClass();

      my.method();
      my.defaultMethod();
   }
}