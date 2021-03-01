package polymorphism;

import java.util.List;

public class SweetCreator {
    private SweetProducer [] factory;

    public SweetCreator(SweetProducer ... sweetProducers) {
        factory = new SweetProducer[sweetProducers.length];
        for (int i = 0; i < factory.length; i++) {
            this.factory[i] = sweetProducers[i];
        }
    }

    public void createSweets() {
        for (int i = 0; i < factory.length; i++) {
            factory[i].produceSweet();
        }
    }
}