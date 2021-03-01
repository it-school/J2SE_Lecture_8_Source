package polymorphism;

public class ChocolateProducer extends SweetProducer {
    @Override
    public void produceSweet() {
        System.out.println("Chocolate produced");
    }
}
