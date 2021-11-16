package polymorphism.example2;

public class Main {
   public static void main(String... args) {
      SweetCreator sweetProducer = new SweetCreator(new CakeProducer(), new ChocolateProducer(), new CookieProducer(), new CookieProducer(), new CookieProducer());
      sweetProducer.createSweets();
   }
}