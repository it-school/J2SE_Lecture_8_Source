package inheritance.multiple;

// Java program to demonstrate Multiple Inheritance through default methods

// Interface 1
interface IParent1 {
   // Default method
   default void show() {
      // Print statement if method is called from interface 1
      System.out.println("Default IP1");
   }
}

// Interface 2
interface IParent2 {
   // Default method
   default void show() {
      // Print statement if method is called from interface 2
      System.out.println("Default IP2");
   }
}

// Implementation class code
class TestClass implements IParent1, IParent2 {
   public static void main(String[] args) {
      // Creating object of this class in main() method
      TestClass d = new TestClass();
      d.show();
   }

   @Override    // Overriding default show method
   public void show() {
      // Using super keyword to call the show method of IP1 interface
      IParent1.super.show();

      // Using super keyword to call the show method of IP2 interface
      IParent2.super.show();
   }
}