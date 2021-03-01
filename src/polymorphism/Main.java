package polymorphism;

import java.util.Arrays;

public class Main {
    public static void main(String... args) {
        SweetCreator sweetProducer = new SweetCreator(new CakeProducer(), new ChocolateProducer(), new CookieProducer());
        sweetProducer.createSweets();
    }
}
