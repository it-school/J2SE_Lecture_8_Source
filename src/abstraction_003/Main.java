package abstraction_003;

// Абстрактный класс может быть унаследован от абстрактного класса.
// Реализация абстрактного метода из базового абстрактного класса,
// в производном абстрактном классе - не обязательна.


// Абстрактный класс A.
abstract class AbstractClassA {
    abstract void OperationA();
}

// Абстрактный класс B.
abstract class AbstractClassB extends AbstractClassA {
    abstract void OperationB();
}

// Конкретный класс.
class ConcreteClass extends AbstractClassB {
    void OperationA() {
        System.out.println("ConcreteClass.OperationA");
    }

    void OperationB() {
        System.out.println("ConcreteClass.OperationB");
    }
}


class Main {
    public static void main(String[] args) {

        AbstractClassA instance = new ConcreteClass();

        instance.OperationA();

        // Этот метод принадлежит классу AbstractClassB
        //instance.OperationB();
    }
}
