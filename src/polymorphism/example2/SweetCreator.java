package polymorphism.example2;

public class SweetCreator {
   private final SweetProducer[] factory;

   public SweetCreator(SweetProducer... sweetProducers) {
      this.factory = sweetProducers;
   }

   public void createSweets() {
      for (SweetProducer sweetProducer : factory) {
         sweetProducer.produceSweet();
      }
   }
}