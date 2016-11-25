package abstraction_005;

abstract class AbstractClass {
    // Конструктор (отрабатывает первым).
    AbstractClass() {
        System.out.println("1 AbstractClass()");

        // Вызывается реализация метода из производного класса - ConcreteClass.
        this.AbstractMethod();

        System.out.println("2 AbstractClass()");
    }

    abstract void AbstractMethod();
}

class ConcreteClass extends AbstractClass {
    private String s = "FIRST";

    // Конструктор (отрабатывает вторым).
    ConcreteClass() {
        System.out.println("3 ConcreteClass()");
        s = "SECOND";
    }

    //  Реализация метода
    void AbstractMethod() {
        System.out.println("Реализация метода AbstractMethod() в ConcreteClass  " + s);
    }
}

public class Main {
    public static void main(String[] args) {
        AbstractClass instance = new ConcreteClass();

        System.out.println("-----------------------------------------------");

        instance.AbstractMethod();
    }
}
